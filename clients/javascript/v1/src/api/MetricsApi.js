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


import ApiClient from "../ApiClient";
import MetricsSummary from '../model/MetricsSummary';

/**
* Metrics service.
* @module api/MetricsApi
* @version 1.1.4
*/
export default class MetricsApi {

    /**
    * Constructs a new MetricsApi. 
    * @alias module:api/MetricsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getMetricsSummary operation.
     * @callback module:api/MetricsApi~getMetricsSummaryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MetricsSummary} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {String} opts.format The format the user requested for the metrics summary (e.g. prometheus)
     * @param {module:api/MetricsApi~getMetricsSummaryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MetricsSummary}
     */
    getMetricsSummary(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'format': opts['format']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['X-Nomad-Token'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = MetricsSummary;
      return this.apiClient.callApi(
        '/metrics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
