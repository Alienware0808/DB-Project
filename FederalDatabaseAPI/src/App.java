package hsfulda.de;

public class App {
    public static void main(final String[] args) {

        /**
         * Logging
         *
         * -Doracle.jdbc.Trace=true -Djava.util.logging.config.file=config.properties
         */

        final String usernameTest = "PROJA04";
        final String passwordTest = "XXXXXX";

        final String usernameValidation = "PROJA04";
        final String passwordValidation = "XXXXXX";

        FedConnection fedConnection;

		/*
         * Test schema
		 */

        try {
            fedConnection = (new FedPseudoDriver()).getConnection(usernameValidation, passwordValidation);

            final FedTestEnvironment fedTestEvironment = new FedTestEnvironment(fedConnection);


            fedTestEvironment.run("Test/DRPTABS.SQL", false);
            fedTestEvironment.run("Test/CREPARTABS.SQL", false);

            /*
            fedTestEvironment.run("Test/INSERTAIRPORTS.SQL", false);
            fedTestEvironment.run("Test/INSERTAIRLINES.SQL", false);
            fedTestEvironment.run("Test/INSERTPASSENGERS.SQL", false);
            fedTestEvironment.run("Test/INSERTFLIGHTS.SQL", false);
            fedTestEvironment.run("Test/INSERTBOOKINGS.SQL", false);
            fedTestEvironment.run("Test/PARSELCNTSTAR.SQL", true);
            fedTestEvironment.run("Test/PARSELS1T.SQL", true);
            fedTestEvironment.run("Test/PARSELS1OR.SQL", true);
            fedTestEvironment.run("Test/PARSELSJOIN1.SQL", true);
            fedTestEvironment.run("Test/PARSELS1TGP.SQL", true);
            fedTestEvironment.run("Test/PARSELS1TWGP.SQL", true);   //OPTIONAL
            fedTestEvironment.run("Test/PARSELS1TGHAV.SQL", true);  //OPTIONAL
            fedTestEvironment.run("Test/PARUPDS.SQL", true);
            fedTestEvironment.run("Test/PARINSERTS.SQL", true);
            fedTestEvironment.run("Test/PARDELS.SQL", true);
            fedTestEvironment.run("Test/PARSELCNTSTAR.SQL", true);
            */
        } catch (final FedException fedException) {
            fedException.printStackTrace();

        }

		/*
		 * Validation schema
		 */
        try {
            fedConnection = (new FedPseudoDriver()).getConnection(usernameValidation, passwordValidation);

            final FedTestEnvironment fedTestEvironment = new FedTestEnvironment(fedConnection);

            /*
            fedTestEvironment.run("Validation/DRPTABS.SQL", false);
            fedTestEvironment.run("Validation/CREPARTABS.SQL", false);
            fedTestEvironment.run("Validation/INSERTAIRPORTS.SQL", false);
            fedTestEvironment.run("Validation/INSERTAIRLINES.SQL", false);
            fedTestEvironment.run("Validation/INSERTPASSENGERS.SQL", false);
            fedTestEvironment.run("Validation/INSERTFLIGHTS.SQL", false);
            fedTestEvironment.run("Validation/INSERTBOOKINGS.SQL", false);
            fedTestEvironment.run("Validation/PARSELCNTSTAR.SQL", true);
            
            fedTestEvironment.run("Validation/INSERT-PASSAGIER-10K-5.SQL", false);
            fedTestEvironment.run("Validation/INSERT-BUCHUNG-10K-5.SQL", false);
            fedTestEvironment.run("Validation/PARSELCNTSTAR.SQL", true);
  
            fedTestEvironment.run("Validation/PARSEL1TSmall.SQL", true);
           	fedTestEvironment.run("Validation/PARSEL1TLarge.SQL", true);
            fedTestEvironment.run("Validation/PARSEL1TOR.SQL", true);
           	fedTestEvironment.run("Validation/PARSELJoinNormal.SQL", true);
            fedTestEvironment.run("Validation/PARSEL1TGPSmall.SQL", true);
            fedTestEvironment.run("Validation/PARSEL1TGPLarge.SQL", true);
            fedTestEvironment.run("Validation/PARSEL1TWGPSmall.SQL", true);  // OPTIONAL
            fedTestEvironment.run("Validation/PARSEL1TWGPLarge.SQL", true);  // OPTIONAL
            fedTestEvironment.run("Validation/PARSELJoinWGP.SQL", true);  // OPTIONAL     
            fedTestEvironment.run("Validation/PARSEL1TGHAVSmall.SQL", true);  // OPTIONAL
            fedTestEvironment.run("Validation/PARSEL1TGHAVLarge.SQL", true);  // OPTIONAL
            fedTestEvironment.run("Validation/PARSELCNTSTAR.SQL", true);            
            */

        } catch (final FedException fedException) {
            fedException.printStackTrace();
        }
    }
}
