<!--
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements. See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
-->
<title>Main page</title>

<%@ taglib prefix="s" uri="/struts-tags" %>

<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <title>My Site - <decorator:title default="Welcome!"/></title>
    <link rel="stylesheet" type="text/css" href="style/layout.css"/>
    <decorator:head/>
</head>
<body>
test
<div id='page'>
    <div id='header'><a href="addUserForm.action">Add User</a>
        | <a href="findUserForm.action">Find User</a>
        | <a href="listAllUsers.action">List all users</a></div>
    <div id='content'>
        <p style="color: red"><s:property value="errorMessage"/></p>
        <decorator:body/>

    </div>
    <div id='footer'>Footer</div>
</div>
</body>
</html>
