/**
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.3
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
    instance = new nomad-client.NetworkResource();
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

  describe('NetworkResource', function() {
    it('should create an instance of NetworkResource', function() {
      // uncomment below and update the code to test NetworkResource
      //var instane = new nomad-client.NetworkResource();
      //expect(instance).to.be.a(nomad-client.NetworkResource);
    });

    it('should have the property CIDR (base name: "CIDR")', function() {
      // uncomment below and update the code to test the property CIDR
      //var instance = new nomad-client.NetworkResource();
      //expect(instance).to.be();
    });

    it('should have the property DNS (base name: "DNS")', function() {
      // uncomment below and update the code to test the property DNS
      //var instance = new nomad-client.NetworkResource();
      //expect(instance).to.be();
    });

    it('should have the property device (base name: "Device")', function() {
      // uncomment below and update the code to test the property device
      //var instance = new nomad-client.NetworkResource();
      //expect(instance).to.be();
    });

    it('should have the property dynamicPorts (base name: "DynamicPorts")', function() {
      // uncomment below and update the code to test the property dynamicPorts
      //var instance = new nomad-client.NetworkResource();
      //expect(instance).to.be();
    });

    it('should have the property IP (base name: "IP")', function() {
      // uncomment below and update the code to test the property IP
      //var instance = new nomad-client.NetworkResource();
      //expect(instance).to.be();
    });

    it('should have the property mBits (base name: "MBits")', function() {
      // uncomment below and update the code to test the property mBits
      //var instance = new nomad-client.NetworkResource();
      //expect(instance).to.be();
    });

    it('should have the property mode (base name: "Mode")', function() {
      // uncomment below and update the code to test the property mode
      //var instance = new nomad-client.NetworkResource();
      //expect(instance).to.be();
    });

    it('should have the property reservedPorts (base name: "ReservedPorts")', function() {
      // uncomment below and update the code to test the property reservedPorts
      //var instance = new nomad-client.NetworkResource();
      //expect(instance).to.be();
    });

  });

}));
