# <p>

<p>
 前端控制器
</p>


---
## 添加学生信息

> BASIC

**Path:** /studentInfo

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
| openid | string |  |
| role | integer |  |
| studentEmail | string |  |
| studentLab | string |  |
| studentName | string |  |
| studentNumber | string |  |
| studentPhone | string |  |
| studentTeacher | string |  |

**Request Demo:**

```json
{
 
  "isFirst": 0,
  "isProve": 0,
  "openid": "",
  "role": 0,
  "studentEmail": "",
  "studentLab": "",
  "studentName": "",
  "studentNumber": "",
  "studentPhone": "",
  "studentTeacher": ""
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
## 更新学生信息

> BASIC

**Path:** /studentInfo

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
| openid | string |  |
| role | integer |  |
| studentEmail | string |  |
| studentLab | string |  |
| studentName | string |  |
| studentNumber | string |  |
| studentPhone | string |  |
| studentTeacher | string |  |

**Request Demo:**

```json
{
  
  "isFirst": 0,
  "isProve": 0,
  "openid": "",
  "role": 0,
  "studentEmail": "",
  "studentLab": "",
  "studentName": "",
  "studentNumber": "",
  "studentPhone": "",
  "studentTeacher": ""
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
## 删除学生信息

> BASIC

**Path:** /studentInfo/{openid}

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



