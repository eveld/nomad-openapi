# CSINodeInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccessibleTopology** | Pointer to [**CSITopology**](CSITopology.md) |  | [optional] 
**ID** | Pointer to **string** |  | [optional] 
**MaxVolumes** | Pointer to **int64** |  | [optional] 
**RequiresNodeStageVolume** | Pointer to **bool** |  | [optional] 

## Methods

### NewCSINodeInfo

`func NewCSINodeInfo() *CSINodeInfo`

NewCSINodeInfo instantiates a new CSINodeInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCSINodeInfoWithDefaults

`func NewCSINodeInfoWithDefaults() *CSINodeInfo`

NewCSINodeInfoWithDefaults instantiates a new CSINodeInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccessibleTopology

`func (o *CSINodeInfo) GetAccessibleTopology() CSITopology`

GetAccessibleTopology returns the AccessibleTopology field if non-nil, zero value otherwise.

### GetAccessibleTopologyOk

`func (o *CSINodeInfo) GetAccessibleTopologyOk() (*CSITopology, bool)`

GetAccessibleTopologyOk returns a tuple with the AccessibleTopology field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccessibleTopology

`func (o *CSINodeInfo) SetAccessibleTopology(v CSITopology)`

SetAccessibleTopology sets AccessibleTopology field to given value.

### HasAccessibleTopology

`func (o *CSINodeInfo) HasAccessibleTopology() bool`

HasAccessibleTopology returns a boolean if a field has been set.

### GetID

`func (o *CSINodeInfo) GetID() string`

GetID returns the ID field if non-nil, zero value otherwise.

### GetIDOk

`func (o *CSINodeInfo) GetIDOk() (*string, bool)`

GetIDOk returns a tuple with the ID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetID

`func (o *CSINodeInfo) SetID(v string)`

SetID sets ID field to given value.

### HasID

`func (o *CSINodeInfo) HasID() bool`

HasID returns a boolean if a field has been set.

### GetMaxVolumes

`func (o *CSINodeInfo) GetMaxVolumes() int64`

GetMaxVolumes returns the MaxVolumes field if non-nil, zero value otherwise.

### GetMaxVolumesOk

`func (o *CSINodeInfo) GetMaxVolumesOk() (*int64, bool)`

GetMaxVolumesOk returns a tuple with the MaxVolumes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxVolumes

`func (o *CSINodeInfo) SetMaxVolumes(v int64)`

SetMaxVolumes sets MaxVolumes field to given value.

### HasMaxVolumes

`func (o *CSINodeInfo) HasMaxVolumes() bool`

HasMaxVolumes returns a boolean if a field has been set.

### GetRequiresNodeStageVolume

`func (o *CSINodeInfo) GetRequiresNodeStageVolume() bool`

GetRequiresNodeStageVolume returns the RequiresNodeStageVolume field if non-nil, zero value otherwise.

### GetRequiresNodeStageVolumeOk

`func (o *CSINodeInfo) GetRequiresNodeStageVolumeOk() (*bool, bool)`

GetRequiresNodeStageVolumeOk returns a tuple with the RequiresNodeStageVolume field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiresNodeStageVolume

`func (o *CSINodeInfo) SetRequiresNodeStageVolume(v bool)`

SetRequiresNodeStageVolume sets RequiresNodeStageVolume field to given value.

### HasRequiresNodeStageVolume

`func (o *CSINodeInfo) HasRequiresNodeStageVolume() bool`

HasRequiresNodeStageVolume returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


