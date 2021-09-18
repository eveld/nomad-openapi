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

import ApiClient from '../ApiClient';
import Job from './Job';

/**
 * The JobRegisterRequest model module.
 * @module model/JobRegisterRequest
 * @version 1.1.4
 */
class JobRegisterRequest {
    /**
     * Constructs a new <code>JobRegisterRequest</code>.
     * @alias module:model/JobRegisterRequest
     */
    constructor() { 
        
        JobRegisterRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>JobRegisterRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JobRegisterRequest} obj Optional instance to populate.
     * @return {module:model/JobRegisterRequest} The populated <code>JobRegisterRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JobRegisterRequest();

            if (data.hasOwnProperty('EnforceIndex')) {
                obj['EnforceIndex'] = ApiClient.convertToType(data['EnforceIndex'], 'Boolean');
            }
            if (data.hasOwnProperty('Job')) {
                obj['Job'] = Job.constructFromObject(data['Job']);
            }
            if (data.hasOwnProperty('JobModifyIndex')) {
                obj['JobModifyIndex'] = ApiClient.convertToType(data['JobModifyIndex'], 'Number');
            }
            if (data.hasOwnProperty('Namespace')) {
                obj['Namespace'] = ApiClient.convertToType(data['Namespace'], 'String');
            }
            if (data.hasOwnProperty('PolicyOverride')) {
                obj['PolicyOverride'] = ApiClient.convertToType(data['PolicyOverride'], 'Boolean');
            }
            if (data.hasOwnProperty('PreserveCounts')) {
                obj['PreserveCounts'] = ApiClient.convertToType(data['PreserveCounts'], 'Boolean');
            }
            if (data.hasOwnProperty('Region')) {
                obj['Region'] = ApiClient.convertToType(data['Region'], 'String');
            }
            if (data.hasOwnProperty('SecretID')) {
                obj['SecretID'] = ApiClient.convertToType(data['SecretID'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} EnforceIndex
 */
JobRegisterRequest.prototype['EnforceIndex'] = undefined;

/**
 * @member {module:model/Job} Job
 */
JobRegisterRequest.prototype['Job'] = undefined;

/**
 * @member {Number} JobModifyIndex
 */
JobRegisterRequest.prototype['JobModifyIndex'] = undefined;

/**
 * @member {String} Namespace
 */
JobRegisterRequest.prototype['Namespace'] = undefined;

/**
 * @member {Boolean} PolicyOverride
 */
JobRegisterRequest.prototype['PolicyOverride'] = undefined;

/**
 * @member {Boolean} PreserveCounts
 */
JobRegisterRequest.prototype['PreserveCounts'] = undefined;

/**
 * @member {String} Region
 */
JobRegisterRequest.prototype['Region'] = undefined;

/**
 * @member {String} SecretID
 */
JobRegisterRequest.prototype['SecretID'] = undefined;






export default JobRegisterRequest;

