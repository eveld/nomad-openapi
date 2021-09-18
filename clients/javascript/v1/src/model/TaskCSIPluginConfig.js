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

/**
 * The TaskCSIPluginConfig model module.
 * @module model/TaskCSIPluginConfig
 * @version 1.1.4
 */
class TaskCSIPluginConfig {
    /**
     * Constructs a new <code>TaskCSIPluginConfig</code>.
     * @alias module:model/TaskCSIPluginConfig
     */
    constructor() { 
        
        TaskCSIPluginConfig.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TaskCSIPluginConfig</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TaskCSIPluginConfig} obj Optional instance to populate.
     * @return {module:model/TaskCSIPluginConfig} The populated <code>TaskCSIPluginConfig</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TaskCSIPluginConfig();

            if (data.hasOwnProperty('ID')) {
                obj['ID'] = ApiClient.convertToType(data['ID'], 'String');
            }
            if (data.hasOwnProperty('MountDir')) {
                obj['MountDir'] = ApiClient.convertToType(data['MountDir'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} ID
 */
TaskCSIPluginConfig.prototype['ID'] = undefined;

/**
 * @member {String} MountDir
 */
TaskCSIPluginConfig.prototype['MountDir'] = undefined;

/**
 * @member {String} Type
 */
TaskCSIPluginConfig.prototype['Type'] = undefined;






export default TaskCSIPluginConfig;

