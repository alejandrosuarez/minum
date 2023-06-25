package minum;

public class Config {
    public static String getDefaultConfig() {
        return """
                ###
                ### The following was generated as a stop-gap measure because the
                ### mandatory config file was missing.  Please see the documentation
                ### for including a more proper configuration file.  This version
                ### lacks some fine-tuning keys.
                
                
                ###  The port used for our plain, non-secure server

                #nonsslServerPort=8080

                #-----------------------------

                ###  the port for our secure, TLS 1.3 server

                #sslServerPort=8443

                #-----------------------------

                ###  the name of our host on the internet.  Used by our
                ###  system when it needs to build a self-referencing URL.

                #hostname=localhost

                ###  database top-level directory

                #dbdir=out/simple_db

                #-----------------------------

                ###  The log levels are:
                ###
                ###  Related to the business purposes of the application.  That is,
                ###  the very highest-level, perhaps least-common logging messages.
                ###  AUDIT
                ###
                ###  Information useful for debugging.
                ###  DEBUG
                ###
                ###
                ###  Represents an error that occurs in a separate thread, so
                ###  that we are not able to catch it bubbling up
                ###  ASYNC_ERROR
                ###
                ###
                ###  Information marked as trace is pretty much entered for
                ###  the same reason as DEBUG - i.e. so we can see important
                ###  information about the running state of the program. The
                ###  only difference is that trace information is very voluminous.
                ###  That is, there's tons of it, and it could make it harder
                ###  to find the important information amongst a lot of noise.
                ###  For that reason, TRACE is usually turned off.
                ###  TRACE
                ###
                ###  list them here, separated by commas

                #loglevels=DEBUG,TRACE,ASYNC_ERROR,AUDIT

                """.stripLeading();
    }

    public static void printConfigError() {
        System.out.print("\n\n\n");
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------- System misconfiguration ----------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        System.out.println("No properties file found at ./app.config");
        System.out.println();
        System.out.println("A file named app.config with the following contents must exist in");
        System.out.println("the directory you were at when running this program. Copy the");
        System.out.println("following text and save it as a file called app.config at that");
        System.out.println("location.");
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");


        System.out.print("\n\n");
        System.out.println("    ****   Copy after this line -v    ****");
        System.out.println("                       ");

        String defaultConfig = Config.getDefaultConfig();
        System.out.print(defaultConfig);

        System.out.println("                        ");
        System.out.println("    ****   Copy before this line -^    ****");

        System.exit(1);
    }
}
