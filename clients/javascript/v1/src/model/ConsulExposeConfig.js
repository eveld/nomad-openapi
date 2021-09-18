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
import ConsulExposePath from './ConsulExposePath';

/**
 * The ConsulExposeConfig model module.
 * @module model/ConsulExposeConfig
 * @version 1.1.4
 */
class ConsulExposeConfig {
    /**
     * Constructs a new <code>ConsulExposeConfig</code>.
     * @alias module:model/ConsulExposeConfig
     */
    constructor() { 
        
        ConsulExposeConfig.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConsulExposeConfig</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConsulExposeConfig} obj Optional instance to populate.
     * @return {module:model/ConsulExposeConfig} The populated <code>ConsulExposeConfig</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConsulExposeConfig();

            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], [ConsulExposePath]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/ConsulExposePath>} Path
 */
ConsulExposeConfig.prototype['Path'] = undefined;






export default ConsulExposeConfig;

