/*
 * Nomad
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.1.3
 * Contact: support@hashicorp.com
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"bytes"
	_context "context"
	_ioutil "io/ioutil"
	_nethttp "net/http"
	_neturl "net/url"
)

// Linger please
var (
	_ _context.Context
)

// SearchApiService SearchApi service
type SearchApiService service

type ApiGetFuzzySearchRequest struct {
	ctx _context.Context
	ApiService *SearchApiService
	fuzzySearchRequest *FuzzySearchRequest
	region *string
	namespace *string
	index *int32
	wait *int32
	stale *string
	prefix *string
	xNomadToken *string
	perPage *int32
	nextToken *string
}

func (r ApiGetFuzzySearchRequest) FuzzySearchRequest(fuzzySearchRequest FuzzySearchRequest) ApiGetFuzzySearchRequest {
	r.fuzzySearchRequest = &fuzzySearchRequest
	return r
}
func (r ApiGetFuzzySearchRequest) Region(region string) ApiGetFuzzySearchRequest {
	r.region = &region
	return r
}
func (r ApiGetFuzzySearchRequest) Namespace(namespace string) ApiGetFuzzySearchRequest {
	r.namespace = &namespace
	return r
}
func (r ApiGetFuzzySearchRequest) Index(index int32) ApiGetFuzzySearchRequest {
	r.index = &index
	return r
}
func (r ApiGetFuzzySearchRequest) Wait(wait int32) ApiGetFuzzySearchRequest {
	r.wait = &wait
	return r
}
func (r ApiGetFuzzySearchRequest) Stale(stale string) ApiGetFuzzySearchRequest {
	r.stale = &stale
	return r
}
func (r ApiGetFuzzySearchRequest) Prefix(prefix string) ApiGetFuzzySearchRequest {
	r.prefix = &prefix
	return r
}
func (r ApiGetFuzzySearchRequest) XNomadToken(xNomadToken string) ApiGetFuzzySearchRequest {
	r.xNomadToken = &xNomadToken
	return r
}
func (r ApiGetFuzzySearchRequest) PerPage(perPage int32) ApiGetFuzzySearchRequest {
	r.perPage = &perPage
	return r
}
func (r ApiGetFuzzySearchRequest) NextToken(nextToken string) ApiGetFuzzySearchRequest {
	r.nextToken = &nextToken
	return r
}

func (r ApiGetFuzzySearchRequest) Execute() (FuzzySearchResponse, *_nethttp.Response, error) {
	return r.ApiService.GetFuzzySearchExecute(r)
}

/*
 * GetFuzzySearch Method for GetFuzzySearch
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @return ApiGetFuzzySearchRequest
 */
func (a *SearchApiService) GetFuzzySearch(ctx _context.Context) ApiGetFuzzySearchRequest {
	return ApiGetFuzzySearchRequest{
		ApiService: a,
		ctx: ctx,
	}
}

/*
 * Execute executes the request
 * @return FuzzySearchResponse
 */
func (a *SearchApiService) GetFuzzySearchExecute(r ApiGetFuzzySearchRequest) (FuzzySearchResponse, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPost
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  FuzzySearchResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "SearchApiService.GetFuzzySearch")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/search/fuzzy"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}
	if r.fuzzySearchRequest == nil {
		return localVarReturnValue, nil, reportError("fuzzySearchRequest is required and must be specified")
	}

	if r.region != nil {
		localVarQueryParams.Add("region", parameterToString(*r.region, ""))
	}
	if r.namespace != nil {
		localVarQueryParams.Add("namespace", parameterToString(*r.namespace, ""))
	}
	if r.wait != nil {
		localVarQueryParams.Add("wait", parameterToString(*r.wait, ""))
	}
	if r.stale != nil {
		localVarQueryParams.Add("stale", parameterToString(*r.stale, ""))
	}
	if r.prefix != nil {
		localVarQueryParams.Add("prefix", parameterToString(*r.prefix, ""))
	}
	if r.perPage != nil {
		localVarQueryParams.Add("per_page", parameterToString(*r.perPage, ""))
	}
	if r.nextToken != nil {
		localVarQueryParams.Add("next_token", parameterToString(*r.nextToken, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.index != nil {
		localVarHeaderParams["index"] = parameterToString(*r.index, "")
	}
	if r.xNomadToken != nil {
		localVarHeaderParams["X-Nomad-Token"] = parameterToString(*r.xNomadToken, "")
	}
	// body params
	localVarPostBody = r.fuzzySearchRequest
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["X-Nomad-Token"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["X-Nomad-Token"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiGetSearchRequest struct {
	ctx _context.Context
	ApiService *SearchApiService
	searchRequest *SearchRequest
	region *string
	namespace *string
	index *int32
	wait *int32
	stale *string
	prefix *string
	xNomadToken *string
	perPage *int32
	nextToken *string
}

func (r ApiGetSearchRequest) SearchRequest(searchRequest SearchRequest) ApiGetSearchRequest {
	r.searchRequest = &searchRequest
	return r
}
func (r ApiGetSearchRequest) Region(region string) ApiGetSearchRequest {
	r.region = &region
	return r
}
func (r ApiGetSearchRequest) Namespace(namespace string) ApiGetSearchRequest {
	r.namespace = &namespace
	return r
}
func (r ApiGetSearchRequest) Index(index int32) ApiGetSearchRequest {
	r.index = &index
	return r
}
func (r ApiGetSearchRequest) Wait(wait int32) ApiGetSearchRequest {
	r.wait = &wait
	return r
}
func (r ApiGetSearchRequest) Stale(stale string) ApiGetSearchRequest {
	r.stale = &stale
	return r
}
func (r ApiGetSearchRequest) Prefix(prefix string) ApiGetSearchRequest {
	r.prefix = &prefix
	return r
}
func (r ApiGetSearchRequest) XNomadToken(xNomadToken string) ApiGetSearchRequest {
	r.xNomadToken = &xNomadToken
	return r
}
func (r ApiGetSearchRequest) PerPage(perPage int32) ApiGetSearchRequest {
	r.perPage = &perPage
	return r
}
func (r ApiGetSearchRequest) NextToken(nextToken string) ApiGetSearchRequest {
	r.nextToken = &nextToken
	return r
}

func (r ApiGetSearchRequest) Execute() (SearchResponse, *_nethttp.Response, error) {
	return r.ApiService.GetSearchExecute(r)
}

/*
 * GetSearch Method for GetSearch
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @return ApiGetSearchRequest
 */
func (a *SearchApiService) GetSearch(ctx _context.Context) ApiGetSearchRequest {
	return ApiGetSearchRequest{
		ApiService: a,
		ctx: ctx,
	}
}

/*
 * Execute executes the request
 * @return SearchResponse
 */
func (a *SearchApiService) GetSearchExecute(r ApiGetSearchRequest) (SearchResponse, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPost
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  SearchResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "SearchApiService.GetSearch")
	if err != nil {
		return localVarReturnValue, nil, GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/search"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}
	if r.searchRequest == nil {
		return localVarReturnValue, nil, reportError("searchRequest is required and must be specified")
	}

	if r.region != nil {
		localVarQueryParams.Add("region", parameterToString(*r.region, ""))
	}
	if r.namespace != nil {
		localVarQueryParams.Add("namespace", parameterToString(*r.namespace, ""))
	}
	if r.wait != nil {
		localVarQueryParams.Add("wait", parameterToString(*r.wait, ""))
	}
	if r.stale != nil {
		localVarQueryParams.Add("stale", parameterToString(*r.stale, ""))
	}
	if r.prefix != nil {
		localVarQueryParams.Add("prefix", parameterToString(*r.prefix, ""))
	}
	if r.perPage != nil {
		localVarQueryParams.Add("per_page", parameterToString(*r.perPage, ""))
	}
	if r.nextToken != nil {
		localVarQueryParams.Add("next_token", parameterToString(*r.nextToken, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.index != nil {
		localVarHeaderParams["index"] = parameterToString(*r.index, "")
	}
	if r.xNomadToken != nil {
		localVarHeaderParams["X-Nomad-Token"] = parameterToString(*r.xNomadToken, "")
	}
	// body params
	localVarPostBody = r.searchRequest
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["X-Nomad-Token"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["X-Nomad-Token"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = _ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
