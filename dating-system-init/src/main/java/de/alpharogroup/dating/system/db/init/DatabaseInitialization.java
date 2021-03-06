package de.alpharogroup.dating.system.db.init;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import de.alpharogroup.db.init.AbstractDatabaseInitialization;


public class DatabaseInitialization extends AbstractDatabaseInitialization {

	public DatabaseInitialization(Properties databaseProperties) {
		super(databaseProperties);
	}

	protected List<File> getScriptFiles() {
		final File insertsDir = getInsertDir();
		List<File> scriptFiles = new ArrayList<>();
		
		scriptFiles.add(new File(insertsDir, "insertPermissions.sql"));
		scriptFiles.add(new File(insertsDir, "insertRoles.sql"));
		scriptFiles.add(new File(insertsDir, "insertCountries.sql"));
		scriptFiles.add(new File(insertsDir, "insertAllFederalStates.sql"));
		scriptFiles.add(new File(insertsDir, "insertAllKnownZipcodes.sql"));
		scriptFiles.add(new File(insertsDir, "insertDefaultImages.sql"));
		scriptFiles.add(new File(insertsDir, "insertGermanSpeekingCountriesZipcodesToAddresses.sql"));
		return scriptFiles;
	}

}
