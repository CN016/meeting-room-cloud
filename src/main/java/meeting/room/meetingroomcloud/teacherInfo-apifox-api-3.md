# <p>

<p>
 前端控制器
</p>


---
## 添加老师信息

> BASIC

**Path:** /teacherInfo

**Method:** POST

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| isFirst | integer |  |
| isProve | integer |  |
| lab | string |  |
| openid | string |  |
| role | integer |  |
| teacherEmail | string |  |
| teacherName | string |  |
| teacherPhone | string |  |

**Request Demo:**

```json
{
  
  "isFirst": 0,
  "isProve": 0,
  "lab": "",
  "openid": "",
  "role": 0,
  "teacherEmail": "",
  "teacherName": "",
  "teacherPhone": ""
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
## 修改老师信息

> BASIC

**Path:** /teacherInfo

**Method:** PUT

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| isFirst | integer |  |
| isProve | integer |  |
| lab | string |  |
| openid | string |  |
| role | integer |  |
| teacherEmail | string |  |
| teacherName | string |  |
| teacherPhone | string |  |

**Request Demo:**

```json
{
 
  "isFirst": 0,
  "isProve": 0,
  "lab": "",
  "openid": "",
  "role": 0,
  "teacherEmail": "",
  "teacherName": "",
  "teacherPhone": ""
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
## 删除老师信息

> BASIC

**Path:** /teacherInfo/{openid}

**Method:** DELETE

> REQUEST

**Path Params:**

| name | value | desc |
| ------------ | ------------ | ------------ |
| openid |  | openid |



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



