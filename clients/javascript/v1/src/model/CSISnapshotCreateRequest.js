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
import CSISnapshot from './CSISnapshot';

/**
 * The CSISnapshotCreateRequest model module.
 * @module model/CSISnapshotCreateRequest
 * @version 1.1.4
 */
class CSISnapshotCreateRequest {
    /**
     * Constructs a new <code>CSISnapshotCreateRequest</code>.
     * @alias module:model/CSISnapshotCreateRequest
     */
    constructor() { 
        
        CSISnapshotCreateRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CSISnapshotCreateRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CSISnapshotCreateRequest} obj Optional instance to populate.
     * @return {module:model/CSISnapshotCreateRequest} The populated <code>CSISnapshotCreateRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CSISnapshotCreateRequest();

            if (data.hasOwnProperty('Namespace')) {
                obj['Namespace'] = ApiClient.convertToType(data['Namespace'], 'String');
            }
            if (data.hasOwnProperty('Region')) {
                obj['Region'] = ApiClient.convertToType(data['Region'], 'String');
            }
            if (data.hasOwnProperty('SecretID')) {
                obj['SecretID'] = ApiClient.convertToType(data['SecretID'], 'String');
            }
            if (data.hasOwnProperty('Snapshots')) {
                obj['Snapshots'] = ApiClient.convertToType(data['Snapshots'], [CSISnapshot]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} Namespace
 */
CSISnapshotCreateRequest.prototype['Namespace'] = undefined;

/**
 * @member {String} Region
 */
CSISnapshotCreateRequest.prototype['Region'] = undefined;

/**
 * @member {String} SecretID
 */
CSISnapshotCreateRequest.prototype['SecretID'] = undefined;

/**
 * @member {Array.<module:model/CSISnapshot>} Snapshots
 */
CSISnapshotCreateRequest.prototype['Snapshots'] = undefined;






export default CSISnapshotCreateRequest;

