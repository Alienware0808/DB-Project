
import java.util.Scanner;

public class FedTestEnvironment {

    private FedConnection fedConnection;

//    public FedTestEnvironment(final FedConnection fedConnection) {
//        this.fedConnection = fedConnection;
//
//        try {
//            this.fedConnection.setAutoCommit(false);
//        } catch (FedException fedException) {
//            System.out.flush();
//
//            System.err.println(fedException.getMessage());
//            System.err.flush();
//        }
//    }

//    public void run(final String filename) {
//        run(filename, false);
//    }
//
//    public void run(final String filename, final boolean debug) {
//        System.out.println("**************************************************************************");
//        System.out.println("Executing script file '" + filename + "'...");
//
//        long op = 0;
//        long start = System.currentTimeMillis();
//
//        final Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream(filename)).useDelimiter(";");
//
//        while (scanner.hasNext()) {
//
//            String statement = scanner.next().trim();
//
//            while (statement.startsWith("/*") || statement.startsWith("--")) {
//                if (statement.startsWith("/*")) {
//                    final String comment = statement.substring(0, statement.indexOf("*/") + 2);
//                    if (debug) {
//                        System.out.println("--> " + comment + " <--");
//                    }
//                    statement = statement.substring(statement.indexOf("*/") + 2).trim();
//                } else {
//                    final String comment = statement.substring(0, statement.indexOf("\n") - 1);
//                    if (debug) {
//                        System.out.println("--> " + comment + " <--");
//                    }
//                    statement = statement.substring(statement.indexOf("\n") + 1).trim();
//                }
//            }
//
//            if (!"".equals(statement)) {
//                if (!"SET ECHO ON".equals(statement.toUpperCase()) && !statement.toUpperCase().startsWith("ALTER SESSION")) {
//                    if (debug) {
//                        System.out.println("Executing \"" + statement + "\"...\n");
//                        System.out.flush();
//                    }
//                    if (statement.toUpperCase().equals("COMMIT")) {
//                        try {
//                            fedConnection.commit();
//                            if (debug) {
//                                System.out.println("Transaction commit");
//                            }
//                        } catch (final FedException fedException) {
//                            System.out.println(fedException.getMessage());
//                            System.out.flush();
//                        }
//                    } else {
//                        if (statement.toUpperCase().equals("ROLLBACK")) {
//                            try {
//                                fedConnection.rollback();
//                                if (debug) {
//                                    System.out.println("Transaction rollback");
//                                }
//                            } catch (final FedException fedException) {
//                                System.out.println(fedException.getMessage());
//                                System.out.flush();
//                            }
//                        } else {
//                            if (statement.toUpperCase().startsWith("SELECT")) {
//                                // SELECT
//                                try {
//                                    final FedStatement fedStatement = fedConnection.getStatement();
//                                    final FedResultSet fedResultSet = fedStatement.executeQuery(statement);
//
//                                    op++;
//
//                                    if (debug) {
//                                        for (int i = 1; i <= fedResultSet.getColumnCount(); i++) {
//                                            System.out.printf("%-15s", fedResultSet.getColumnName(i));
//                                        }
//                                        System.out.println();
//
//                                        for (int i = 1; i <= fedResultSet.getColumnCount(); i++) {
//                                            System.out.print("-------------- ");
//                                        }
//                                        System.out.println();
//
//                                        while (fedResultSet.next()) {
//                                            for (int i = 1; i <= fedResultSet.getColumnCount(); i++) {
//                                                System.out.printf("%-15s", fedResultSet.getString(i));
//                                            }
//                                            System.out.println();
//                                        }
//                                        System.out.println();
//                                    }
//                                    fedStatement.close();
//                                } catch (final FedException fedException) {
//                                    System.out.println(fedException.getMessage());
//                                    System.out.flush();
//                                }
//                            } else {
//                                // UPDATE, INSERT, DELETE
//                                try {
//                                    final FedStatement fedStatement = fedConnection.getStatement();
//                                    final int count = fedStatement.executeUpdate(statement);
//
//                                    op++;
//
//                                    if (statement.toUpperCase().startsWith("UPDATE")) {
//                                        if (debug) {
//                                            System.out.println(count + " rows updated\n");
//                                        }
//                                    } else {
//                                        if (statement.toUpperCase().startsWith("INSERT")) {
//                                            if (debug) {
//                                                System.out.println(count + " rows inserted\n");
//                                            }
//                                        } else {
//                                            if (statement.toUpperCase().startsWith("DELETE")) {
//                                                if (debug) {
//                                                    System.out.println(count + " rows deleted\n");
//                                                }
//                                            } else {
//                                                if (debug) {
//                                                    System.out.println(count + " OK");
//                                                }
//                                            }
//                                        }
//                                    }
//
//                                    fedStatement.close();
//                                } catch (final FedException fedException) {
//                                    System.out.println(fedException.getMessage());
//                                    System.out.flush();
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        final long end = System.currentTimeMillis();
//        final long delta = end - start;
//
//        System.out.println("File '" + filename + "', " + op + " operations, " + delta + " milliseconds");
//        System.out.println("**************************************************************************\n");
//    }
}
