# <p>

<p>
 前端控制器
</p>


---
## 添加房间信息

> BASIC

**Path:** /roomInfo

**Method:** POST

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| roomid | integer |  |
| roomCoverImg | string |  |
| fileId | string |  |
| roomPeople | string |  |
| roomType | string |  |
| roomName | string |  |
| roomContactPhone | string |  |
| roomContactName | string |  |
| roomBriefInfo | string |  |

**Request Demo:**

```json
{
 
  "roomid": 0,
  "roomCoverImg": "",
  "fileId": "",
  "roomPeople": "",
  "roomType": "",
  "roomName": "",
  "roomContactPhone": "",
  "roomContactName": "",
  "roomBriefInfo": ""
}
```



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| code | integer |  |
| message | string |  |
| data | string |  |

**Response Demo:**

```json
{
  "code": 0,
  "message": "",
  "data": ""
}
```




---
## 修改房间信息

> BASIC

**Path:** /roomInfo

**Method:** PUT

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| roomid | integer |  |
| roomCoverImg | string |  |
| fileId | string |  |
| roomPeople | string |  |
| roomType | string |  |
| roomName | string |  |
| roomContactPhone | string |  |
| roomContactName | string |  |
| roomBriefInfo | string |  |

**Request Demo:**

```json
{
  
  "roomid": 0,
  "roomCoverImg": "",
  "fileId": "",
  "roomPeople": "",
  "roomType": "",
  "roomName": "",
  "roomContactPhone": "",
  "roomContactName": "",
  "roomBriefInfo": ""
}
```



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| code | integer |  |
| message | string |  |
| data | string |  |

**Response Demo:**

```json
{
  "code": 0,
  "message": "",
  "data": ""
}
```




---
## 获取房间信息

> BASIC

**Path:** /roomInfo/{roomId}

**Method:** GET

> REQUEST

**Path Params:**

| name | value | desc |
| ------------ | ------------ | ------------ |
| roomId |  | 房间id |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| code | integer |  |
| message | string |  |
| data | object |  |
| &ensp;&ensp;&#124;─id | integer |  |
| &ensp;&ensp;&#124;─roomid | integer |  |
| &ensp;&ensp;&#124;─roomCoverImg | string |  |
| &ensp;&ensp;&#124;─fileId | string |  |
| &ensp;&ensp;&#124;─roomPeople | string |  |
| &ensp;&ensp;&#124;─roomType | string |  |
| &ensp;&ensp;&#124;─roomName | string |  |
| &ensp;&ensp;&#124;─roomContactPhone | string |  |
| &ensp;&ensp;&#124;─roomContactName | string |  |
| &ensp;&ensp;&#124;─roomBriefInfo | string |  |

**Response Demo:**

```json
{
  "code": 0,
  "message": "",
  "data": {
    "id": 0,
    "roomid": 0,
    "roomCoverImg": "",
    "fileId": "",
    "roomPeople": "",
    "roomType": "",
    "roomName": "",
    "roomContactPhone": "",
    "roomContactName": "",
    "roomBriefInfo": ""
  }
}
```




---
## 删除房间信息

> BASIC

**Path:** /roomInfo/{roomId}

**Method:** DELETE

> REQUEST

**Path Params:**

| name | value | desc |
| ------------ | ------------ | ------------ |
| roomId |  | 房间id |



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| code | integer |  |
| message | string |  |
| data | string |  |

**Response Demo:**

```json
{
  "code": 0,
  "message": "",
  "data": ""
}
```



