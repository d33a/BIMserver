package org.bimserver.database.migrations.steps;

import org.bimserver.database.migrations.Migration;
import org.bimserver.database.migrations.Schema;
import org.bimserver.database.migrations.Schema.Multiplicity;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

public class Step0010 extends Migration {

	@Override
	public void migrate(Schema schema) {
		EClass checkinResultClass = schema.createEClass(schema.getEPackage("store"), "CheckinResult");
		schema.createEReference(checkinResultClass, "revision", schema.getEClass("store", "Revision"), Multiplicity.SINGLE);
		schema.createEAttribute(checkinResultClass, "rid", EcorePackage.eINSTANCE.getEInt(), Multiplicity.SINGLE);
		schema.createEReference(checkinResultClass, "project", schema.getEClass("store", "Project"), Multiplicity.SINGLE);
		
		EClass downloadResultClass = schema.createEClass(schema.getEPackage("store"), "DownloadResult");
		schema.createEAttribute(downloadResultClass, "projectName", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(downloadResultClass, "revisionNr", ecorePackage.getEInt(), Multiplicity.SINGLE);
		schema.createEAttribute(downloadResultClass, "file", ecorePackage.getEByteArray(), Multiplicity.SINGLE);

		schema.createEClass(schema.getEPackage("store"), "CheckoutResult", downloadResultClass);
		
		EClass dataValue = schema.createEClass(schema.getEPackage("store"), "DataValue");
		schema.createEAttribute(dataValue, "fieldName", ecorePackage.getEString(), Multiplicity.SINGLE);

		EClass dataObjectClass = schema.createEClass(schema.getEPackage("store"), "DataObject");
		schema.createEAttribute(dataObjectClass, "type", EcorePackage.eINSTANCE.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(dataObjectClass, "guid", EcorePackage.eINSTANCE.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(dataObjectClass, "name", EcorePackage.eINSTANCE.getEString(), Multiplicity.SINGLE);
		schema.createEReference(dataObjectClass, "values", dataValue, Multiplicity.MANY).getEAnnotations().add(createEmbedsReference());
		
		EClass userSessionClass = schema.createEClass(schema.getEPackage("store"), "UserSession");
		schema.createEReference(userSessionClass, "user", schema.getEClass("store", "User"), Multiplicity.SINGLE);
		schema.createEAttribute(userSessionClass, "username", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(userSessionClass, "name", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(userSessionClass, "type", schema.getEEnum("store", "UserType"), Multiplicity.SINGLE);
		schema.createEAttribute(userSessionClass, "activeSince", ecorePackage.getEDate(), Multiplicity.SINGLE);
		schema.createEAttribute(userSessionClass, "lastActive", ecorePackage.getEDate(), Multiplicity.SINGLE);
		schema.createEAttribute(userSessionClass, "accessMethod", schema.getEEnum("log", "AccessMethod"), Multiplicity.SINGLE);
		
		EClass migrationClass = schema.createEClass(schema.getEPackage("store"), "Migration");
		schema.createEAttribute(migrationClass, "number", ecorePackage.getEInt(), Multiplicity.SINGLE);
		schema.createEAttribute(migrationClass, "description", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(migrationClass, "executed", ecorePackage.getEBoolean(), Multiplicity.SINGLE);
		
		EClass referenceDataValue = schema.createEClass(schema.getEPackage("store"), "ReferenceDataValue", dataValue);
		schema.createEAttribute(referenceDataValue, "typeName", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(referenceDataValue, "guid", ecorePackage.getEString(), Multiplicity.SINGLE);
		
		EClass listDataValue = schema.createEClass(schema.getEPackage("store"), "ListDataValue", dataValue);
		schema.createEReference(listDataValue, "values", dataValue, Multiplicity.MANY).getEAnnotations().add(createEmbedsReference());;
		
		EClass simpleDataValue = schema.createEClass(schema.getEPackage("store"), "SimpleDataValue", dataValue);
		schema.createEAttribute(simpleDataValue, "stringValue", ecorePackage.getEString(), Multiplicity.SINGLE);
		
		EClass databaseInformationClass = schema.createEClass(schema.getEPackage("store"), "DatabaseInformation");
		schema.createEAttribute(databaseInformationClass, "numberOfProjects", ecorePackage.getEInt(), Multiplicity.SINGLE);
		schema.createEAttribute(databaseInformationClass, "numberOfUsers", ecorePackage.getEInt(), Multiplicity.SINGLE);
		schema.createEAttribute(databaseInformationClass, "numberOfRevisions", ecorePackage.getEInt(), Multiplicity.SINGLE);
		schema.createEAttribute(databaseInformationClass, "numberOfCheckouts", ecorePackage.getEInt(), Multiplicity.SINGLE);
		schema.createEAttribute(databaseInformationClass, "databaseSizeInBytes", ecorePackage.getELong(), Multiplicity.SINGLE);
		schema.createEAttribute(databaseInformationClass, "type", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(databaseInformationClass, "created", ecorePackage.getEDate(), Multiplicity.SINGLE);
		schema.createEAttribute(databaseInformationClass, "location", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(databaseInformationClass, "schemaVersion", ecorePackage.getEInt(), Multiplicity.SINGLE);
		schema.createEAttribute(databaseInformationClass, "genericLines", ecorePackage.getEString(), Multiplicity.SINGLE);
		
		EClass serializerPluginDescriptorClass = schema.createEClass(schema.getEPackage("store"), "SerializerPluginDescriptor");
		schema.createEAttribute(serializerPluginDescriptorClass, "pluginClassName", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(serializerPluginDescriptorClass, "defaultName", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(serializerPluginDescriptorClass, "defaultExtension", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(serializerPluginDescriptorClass, "defaultContentType", ecorePackage.getEString(), Multiplicity.SINGLE);
		
		EClass revisionSummaryTypeClass = schema.createEClass(schema.getEPackage("store"), "RevisionSummaryType");
		schema.createEAttribute(revisionSummaryTypeClass, "name", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(revisionSummaryTypeClass, "count", ecorePackage.getEInt(), Multiplicity.SINGLE);
		
		EClass revisionSummaryContainerClass = schema.createEClass(schema.getEPackage("store"), "RevisionSummaryContainer");
		schema.createEAttribute(revisionSummaryContainerClass, "name", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEReference(revisionSummaryContainerClass, "types", revisionSummaryTypeClass, Multiplicity.MANY).getEAnnotations().add(createEmbedsReference());;
		
		EClass revisionSummaryClass = schema.createEClass(schema.getEPackage("store"), "RevisionSummary");
		schema.createEReference(revisionSummaryClass, "list", revisionSummaryContainerClass, Multiplicity.MANY).getEAnnotations().add(createEmbedsReference());;
		
		EClass pluginDescriptorClass = schema.createEClass(schema.getEPackage("store"), "PluginDescriptor");
		schema.createEAttribute(pluginDescriptorClass, "name", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(pluginDescriptorClass, "description", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(pluginDescriptorClass, "location", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(pluginDescriptorClass, "enabled", ecorePackage.getEBoolean(), Multiplicity.SINGLE);
		
		EClass longActionClass = schema.createEClass(schema.getEPackage("store"), "LongAction");
		schema.createEAttribute(longActionClass, "identification", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEReference(longActionClass, "user", schema.getEClass("store", "User"), Multiplicity.SINGLE);
		schema.createEAttribute(longActionClass, "start", ecorePackage.getEDate(), Multiplicity.SINGLE);
		schema.createEAttribute(longActionClass, "username", ecorePackage.getEString(), Multiplicity.SINGLE);
		schema.createEAttribute(longActionClass, "name", ecorePackage.getEString(), Multiplicity.SINGLE);
		
		EClass guidanceProviderPluginDescriptor = schema.createEClass(schema.getEPackage("store"), "GuidanceProviderPluginDescriptor");
		schema.createEAttribute(guidanceProviderPluginDescriptor, "className", ecorePackage.getEString(), Multiplicity.SINGLE);
		
		EClass compareResultClass = schema.createEClass(schema.getEPackage("store"), "CompareResult");
		
		EEnum actionStateEnum = schema.createEEnum(schema.getEPackage("store"), "ActionState");
		schema.createEEnumLiteral(actionStateEnum, "UNKNOWN");
		schema.createEEnumLiteral(actionStateEnum, "STARTED");
		schema.createEEnumLiteral(actionStateEnum, "FINISHED");
		
		EClass longActionStateClass = schema.createEClass(schema.getEPackage("store"), "LongActionState");
		schema.createEAttribute(longActionStateClass, "progress", ecorePackage.getEInt(), Multiplicity.SINGLE);
		schema.createEAttribute(longActionStateClass, "state", actionStateEnum, Multiplicity.SINGLE);
	}

	private EAnnotation createEmbedsReference() {
		EAnnotation embedsReferenceAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		embedsReferenceAnnotation.setSource("embedsreference");
		return embedsReferenceAnnotation;
	}

	@Override
	public String getDescription() {
		return "Adds notification stuff";
	}
}