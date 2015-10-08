var contentType = "vm:orgunit";
var documentName = url.templateArgs.documentName;

var document = companyhome.createNode(documentName, contentType);
var company = companyhome.createNode(documentName + "_company", "vm:company");

if (document != null){
	model.document = document;
	model.msg = "Created OK!";
}
else {
	model.msg = "Failed to create document!";
}
