package org.bimserver.test.framework;

import java.io.File;

import org.bimserver.client.factories.BimServerClientFactory;
import org.bimserver.test.framework.actions.ActionFactory;

public class TestConfiguration {
	private int nrVirtualUsers;
	private int nrRunsPerVirtualUser;
	private boolean startEmbeddedBimServer;
	private boolean cleanEnvironmentFirst;
	private boolean stopOnUserException;
	private boolean stopOnServerException;
	private File ifcFilesFolder;
	private ActionFactory actionFactory;
	private File outputFolder;
	private BimServerClientFactory bimServerClientFactory;
	
	public int getNrVirtualUsers() {
		return nrVirtualUsers;
	}

	public void setNrVirtualUsers(int nrVirtualUsers) {
		this.nrVirtualUsers = nrVirtualUsers;
	}

	public int getNrRunsPerVirtualUser() {
		return nrRunsPerVirtualUser;
	}

	public void setNrRunsPerVirtualUser(int nrRunsPerVirtualUser) {
		this.nrRunsPerVirtualUser = nrRunsPerVirtualUser;
	}

	public boolean isStartEmbeddedBimServer() {
		return startEmbeddedBimServer;
	}

	public void setStartEmbeddedBimServer(boolean startEmbeddedBimServer) {
		this.startEmbeddedBimServer = startEmbeddedBimServer;
	}

	public boolean isCleanEnvironmentFirst() {
		return cleanEnvironmentFirst;
	}

	public void setCleanEnvironmentFirst(boolean cleanEnvironmentFirst) {
		this.cleanEnvironmentFirst = cleanEnvironmentFirst;
	}

	public boolean isStopOnUserException() {
		return stopOnUserException;
	}

	public void setStopOnUserException(boolean stopOnUserException) {
		this.stopOnUserException = stopOnUserException;
	}

	public boolean isStopOnServerException() {
		return stopOnServerException;
	}

	public void setStopOnServerException(boolean stopOnServerException) {
		this.stopOnServerException = stopOnServerException;
	}

	public File getIfcFiles() {
		return ifcFilesFolder;
	}

	public void setIfcFilesFolder(File ifcFilesFolder) {
		this.ifcFilesFolder = ifcFilesFolder;
	}

	public ActionFactory getActionFactory() {
		return actionFactory;
	}

	public void setActionFactory(ActionFactory actionFactory) {
		this.actionFactory = actionFactory;
	}

	public File getOutputFolder() {
		return outputFolder;
	}

	public void setOutputFolder(File outputFolder) {
		this.outputFolder = outputFolder;
	}

	public BimServerClientFactory getBimServerClientFactory() {
		return bimServerClientFactory;
	}

	public void setBimServerClientFactory(BimServerClientFactory bimServerClientFactory) {
		this.bimServerClientFactory = bimServerClientFactory;
	}
}