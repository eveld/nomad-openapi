/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.nomad-client);
  }
}(this, function(expect, nomad-client) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new nomad-client.CSIControllerInfo();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('CSIControllerInfo', function() {
    it('should create an instance of CSIControllerInfo', function() {
      // uncomment below and update the code to test CSIControllerInfo
      //var instane = new nomad-client.CSIControllerInfo();
      //expect(instance).to.be.a(nomad-client.CSIControllerInfo);
    });

    it('should have the property supportsAttachDetach (base name: "SupportsAttachDetach")', function() {
      // uncomment below and update the code to test the property supportsAttachDetach
      //var instance = new nomad-client.CSIControllerInfo();
      //expect(instance).to.be();
    });

    it('should have the property supportsListVolumes (base name: "SupportsListVolumes")', function() {
      // uncomment below and update the code to test the property supportsListVolumes
      //var instance = new nomad-client.CSIControllerInfo();
      //expect(instance).to.be();
    });

    it('should have the property supportsListVolumesAttachedNodes (base name: "SupportsListVolumesAttachedNodes")', function() {
      // uncomment below and update the code to test the property supportsListVolumesAttachedNodes
      //var instance = new nomad-client.CSIControllerInfo();
      //expect(instance).to.be();
    });

    it('should have the property supportsReadOnlyAttach (base name: "SupportsReadOnlyAttach")', function() {
      // uncomment below and update the code to test the property supportsReadOnlyAttach
      //var instance = new nomad-client.CSIControllerInfo();
      //expect(instance).to.be();
    });

  });

}));
