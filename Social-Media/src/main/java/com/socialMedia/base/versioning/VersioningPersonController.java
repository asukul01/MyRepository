package com.socialMedia.base.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	/*
	 * Versioning 
	 * 1. URI versioning - pollute URI 
	 * 2. Request parameter versioning - pollute URI 
	 * 3. Header paramater versioning - miuse of header as it was never
	 * intended for versioning - caching becomes complicated 
	 * 4. Accept type/Mime Type versioning - miuse of header as it was never intended for versioning -
	 * caching becomes complicated
	 */
	// option 1 using different URI
	// used by twitter
	@GetMapping("v1/person")
	public PersonV1 pv1() {
		return new PersonV1("Aritra Sukul");
	}

	@GetMapping("v2/person")
	public PersonV2 pv2() {
		return new PersonV2(new Name("Aritra", "Sukul"));
	}

	// option 2 using req parameter
	// used by amazon
	@GetMapping(value = "/person/param", params = "version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Aritra Sukul");
	}

	@GetMapping(value = "/person/param", params = "version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Aritra", "Sukul"));
	}

	// option 3 using header param
	// used by microsoft
	@GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Aritra Sukul");
	}

	@GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Aritra", "Sukul"));
	}

	// option 4 using producers/ mime type versioning/accept header versioning
	// used by github
	@GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
	public PersonV1 producesV1() {
		return new PersonV1("Aritra Sukul");
	}

	@GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
	public PersonV2 producesV2() {
		return new PersonV2(new Name("Aritra", "Sukul"));
	}
}
