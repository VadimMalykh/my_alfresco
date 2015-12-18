var contentType = "vm:orgunit";
var documentName = url.templateArgs.documentName;

var document = companyhome.createNode(documentName, contentType);
var company = companyhome.createNode(documentName + "_company", "vm:company");
var department = companyhome.createNode(documentName + "_department", "vm:department")

document.createAssociation(company, "vm:parentOrgUnit")
department.createAssociation(company, "vm:parentOrgUnit")


if (document != null){
	model.document = document;
	model.msg = "Created OK!";
}
else {
	model.msg = "Failed to create document!";
}
