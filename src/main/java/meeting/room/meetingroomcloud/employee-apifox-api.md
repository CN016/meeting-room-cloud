# <p>

<p>
 前端控制器
</p>


---
## 添加新的employee

> BASIC

**Path:** /employeeInfo

**Method:** POST

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| companyName | string |  |
| employeeName | string |  |
| employeePhone | string |  |
| employeeEmail | string |  |
| employeeJob | string |  |
| openId | string |  |
| isProve | integer |  |
| isFirst | integer |  |

**Request Demo:**

```json
{
  "companyName": "",
  "employeeName": "",
  "employeePhone": "",
  "employeeEmail": "",
  "employeeJob": "",
  "openId": "",
  "isProve": 0,
  "isFirst": 0
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
## 修改employee信息

> BASIC

**Path:** /employeeInfo

**Method:** PUT

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| companyName | string |  |
| employeeName | string |  |
| employeePhone | string |  |
| employeeEmail | string |  |
| employeeJob | string |  |
| openId | string |  |
| isProve | integer |  |
| isFirst | integer |  |

**Request Demo:**

```json
{

  "companyName": "",
  "employeeName": "",
  "employeePhone": "",
  "employeeEmail": "",
  "employeeJob": "",
  "openId": "",
  "isProve": 0,
  "isFirst": 0
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
## 删除employee信息

> BASIC

**Path:** /employeeInfo/{openid}

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



