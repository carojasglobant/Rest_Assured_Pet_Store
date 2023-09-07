# Rest_Assured_Pet_Store
a little practice to exercise rest assured

## findByStatus endpoint 
Method: Get <br/>
Path: /pet/findByStatus <br/>
status: Query param <br/>
Possible values: available, pending, sold


### Test case °1
Valid get when status: available
<br/>
Given: The user requires the pet status
<br/>
When: A GET request is made to https://petstore.swagger.io/v2//pet/findByStatus with
<br/>
Query param findByStatus="available"
<br/>
Then: The response should be in the next json structure:
<br/>
  [ {
  "id": number,
  "category": {
  "id": number,
  "name": string
  },
  "name":string,
  "photoUrls": [
  string
  ],
  "tags": [
  {
  "id": number,
  "name": string
  }
  ],
  "status": "available"
  }, {} ... ]

### Test case °2
Valid get when status: pending
<br/>
Given: The user requires the pet status
<br/>
When: A GET request is made to petstore.swagger.io/v2//pet/findByStatus with
<br/>
Query param findByStatus="pending"
<br/>
  Then: The response should be in the next json structure:
  <br/>
  [ {
  "id": double,
  "category": {
  "id": number,
  "name": string
  },
  "name": string,
  "photoUrls": [
  "string"
  ],
  "tags": [
  {
  "id": number,
  "name": string
  }
  ],
  "status": "pending"
  }, {} ... ]

### Test case °3

Valid get when status: sold
  <br/>
  Given: The user requires the pet status
  <br/>
  When: A GET request is made to petstore.swagger.io/v2//pet/findByStatus with
  <br/>
  Query param findByStatus="sold"
  <br/>
  Then: The response should be in the next json structure:
  <br/>
  [ {
  "id": double,
  "category": {
  "id": number,
  "name": string
  },
  "name": string,
  "photoUrls": [
  "string"
  ],
  "tags": [
  {
  "id": number,
  "name": string
  }
  ],
  "status": "sold"
  }, {} ... ]
