VERSION=$(shell grep -om1 -E '<version>[0-9\.]+</version>' pom.xml | head -n 1 | sed 's/<version>\(.*\)<\/version>/\1/')
DIST=target/dist
INSTALL=target/install

clean:
	rm -rf target

build: clean
	docker run \
		--rm \
		-v "$$(pwd)":/tmp/talon-client \
		-w "/tmp/talon-client" \
		maven:latest\
		/bin/bash -c "mvn clean install && \
			mkdir $(INSTALL) && \
			cp ~/.m2/repository/one/talon/talon-one-client/maven-metadata-local.xml $(INSTALL)/ && \
			cp -r ~/.m2/repository/one/talon/talon-one-client/$(VERSION) $(INSTALL)/$(VERSION)"

bundle:
	rm -rf $(DIST) && \
	mkdir $(DIST) && \
	cp -r $(INSTALL)/. $(DIST)/
	rm -f $(DIST)/$(VERSION)/talon-one-client-$(VERSION)-javadoc.jar
	rm -f $(DIST)/$(VERSION)/talon-one-client-$(VERSION)-tests.jar
	@for f in $(DIST)/$(VERSION)/*.jar $(DIST)/$(VERSION)/*.pom; do \
		md5sum $$f | cut -f 1 -d " " > $$f.md5; \
	done

prepare: build bundle

testenv:
	docker run \
		--rm -it \
		-v $(PWD):/tmp/talon-client \
		-w "/tmp/talon-client" \
		maven:3.5.2-jdk-9-slim \
		/bin/bash
