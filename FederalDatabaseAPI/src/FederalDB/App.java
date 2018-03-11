package FederalDB;

//package hsfulda.de;
public class App
{

    public static void main(final String[] args)
    {

        /**
         * Logging
         *
         * -Doracle.jdbc.Trace=true
         * -Djava.util.logging.config.file=config.properties
         */
        final String usernameTest = "VDBSA09";
        final String passwordTest = "VDBSA09";

        final String usernameValidation = "VDBSA09";
        final String passwordValidation = "VDBSA09";

        FedConnection fedConnection;


        /*
         * Test schema
         */
        try
        {
            fedConnection = (new FedPseudoDriver()).getConnection(usernameValidation, passwordValidation);
            
            
            final FedTestEnvironment fedTestEvironment = new FedTestEnvironment(fedConnection);

            fedTestEvironment.run("SQL Test/DRPTABS.SQL", false);
            fedTestEvironment.run("SQL Test/CREPARTABS.SQL", false);
            fedTestEvironment.run("SQL Test/INSERTAIRPORTS.SQL", false);
            fedTestEvironment.run("SQL Test/INSERTAIRLINES.SQL", false);
            fedTestEvironment.run("SQL Test/INSERTPASSENGERS.SQL", false);
            fedTestEvironment.run("SQL Test/INSERTFLIGHTS.SQL", false);
            fedTestEvironment.run("SQL Test/INSERTBOOKINGS.SQL", false);
            fedTestEvironment.run("SQL Test/PARSELCNTSTAR.SQL", false);
            fedTestEvironment.run("SQL Test/PARSELS1T.SQL", false);
            fedTestEvironment.run("SQL Test/PARSELS1OR.SQL", false);
            fedTestEvironment.run("SQL Test/PARSELSJOIN1.SQL", false);
            fedTestEvironment.run("SQL Test/PARSELS1TGP.SQL", false);
            fedTestEvironment.run("SQL Test/PARSELS1TWGP.SQL", false);   //OPTIONAL
            fedTestEvironment.run("SQL Test/PARSELS1TGHAV.SQL", false);  //OPTIONAL
            fedTestEvironment.run("SQL Test/PARUPDS.SQL", false);
            fedTestEvironment.run("SQL Test/PARINSERTS.SQL", false);
            fedTestEvironment.run("SQL Test/PARDELS.SQL", false);
            fedTestEvironment.run("SQL Test/PARSELCNTSTAR.SQL", false);
            
            /*
            fedTestEvironment.run("Validation/DRPTABS.SQL",true);
            fedTestEvironment.run("Validation/CREPARTABS.SQL",true);
            fedTestEvironment.run("Validation/INSERT-PASSAGIER-10K-5.SQL",true);
            fedTestEvironment.run("Validation/INSERT-BUCHUNG-10K-5.SQL",true);
            fedTestEvironment.run("Validation/INSERTAIRLINES.SQL",true);
            fedTestEvironment.run("Validation/INSERTAIRPORTS.SQL",true);
            fedTestEvironment.run("Validation/INSERTBOOKINGS.SQL",true);
            fedTestEvironment.run("Validation/INSERTFLIGHTS.SQL",true);
            fedTestEvironment.run("Validation/INSERTPASSENGERS.SQL",true);
            fedTestEvironment.run("Validation/PARSEL1TGHAVLarge.SQL",true);
            fedTestEvironment.run("Validation/PARSEL1TGHAVSmall.SQL",true);
            fedTestEvironment.run("Validation/PARSEL1TGPLarge.SQL",true);
            fedTestEvironment.run("Validation/PARSEL1TGPSmall.SQL",true);
            fedTestEvironment.run("Validation/PARSEL1TLarge.SQL",true);
            fedTestEvironment.run("Validation/PARSEL1TOR.SQL",true);
            fedTestEvironment.run("Validation/PARSEL1TSmall.SQL",true);
            fedTestEvironment.run("Validation/PARSEL1TWGPLarge.SQL",true);
            fedTestEvironment.run("Validation/PARSEL1TWGPSmall.SQL",true);
            fedTestEvironment.run("Validation/PARSELCNTSTAR.SQL",true);
            fedTestEvironment.run("Validation/PARSELJoinNormal.SQL",true);
            fedTestEvironment.run("Validation/PARSELJoinWGP.SQL",true);
         */
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        /*
		 * Validation schema
         */
        try
        {
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
//        } catch (final FedException fedException) {
//            fedException.printStackTrace();
//        }
        } catch (final Exception e)
        {

        }
    }
}
