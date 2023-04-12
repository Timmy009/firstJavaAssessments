package schoolExercises;

import java.util.Scanner;

public class NokiaPhoneMenuWithBackOption {
    public static void main(String[] args) {
        nokiaMenu();

    }

    public static void nokiaMenu () {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. Sim services");
        System.out.println("14. Exit");


        int menuFunctionsNumber = input.nextInt();
        switch (menuFunctionsNumber) {
            case 1:
                phoneBook();

                break;
            case 2:
                messages();
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                callRegister();
                break;
            case 5:
                System.out.println("1. Ringing Tone");
                System.out.println("2. Ringing Volume");
                System.out.println("3. Incoming call alert");
                System.out.println("4. Composer");
                System.out.println("5. Message alert tone");
                System.out.println("6. Keypad tones");
                System.out.println("7. Warning and games tones");
                System.out.println("8. Vibrating alert");
                System.out.println("9. Screen saver");
                System.out.println("10. Back");
                int tones = input.nextInt();
                switch (tones) {
                    case 1:
                        System.out.println("Rimging Tone");
                        break;
                    case 2:
                        System.out.println("Ringing Volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("4. Composer");
                        break;
                    case 5:
                        System.out.println("5. Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad Tone");
                        break;
                    case 7:
                        System.out.println("Warning and Game tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                    case 10:
                        nokiaMenu();
                        break;
                }
                break;
            case 6:
                settings();
                break;
            case 7:
                System.out.println("Call Divert");
                break;

            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                System.out.println("1. Alarm clock");
                System.out.println("2. Clock settings");
                System.out.println("3. Date clock");
                System.out.println("4. Stopwatch");
                System.out.println("5. Countdown timer");
                System.out.println("6. Auto update of date and time");
                System.out.println("7. Back");
                int clock = input.nextInt();
                switch (clock) {
                    case 1:
                        System.out.println("Alarm clock");
                        break;
                    case 2:
                        System.out.println("Clock settings");
                        break;
                    case 3:
                        System.out.println("Date settings");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown timer");
                        break;
                    case 6:
                        System.out.println("Auto update of date and time");
                        break;
                    case 7:
                        nokiaMenu();
                        break;
                }
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("Sim services");
                break;
            case 14:
                System.out.println("Good bye");
                break;
        }
    }
    public static void phoneBook () {

        Scanner input = new Scanner(System.in);
        System.out.println("1. Search");
        System.out.println("2. Service Nos.");
        System.out.println("3. Add name");
        System.out.println("4. Erase");
        System.out.println("5. Edit");
        System.out.println("6. Assign tone");
        System.out.println("7. Send b`card");
        System.out.println("8. Options");
        System.out.println("9. Speed dials");
        System.out.println("10. Voice tags");
        System.out.println("11. Back");
        int search = input.nextInt();
        switch (search) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos.");
                break;
            case 3:
                System.out.println("Add name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("Send b`card");
                break;
            case 8:
                System.out.println("1. Type of view");
                System.out.println("2. Memory status");
                System.out.println("3. Back");
                int options = input.nextInt();
                switch (options) {
                    case 1:
                        System.out.println("Type of view");
                        break;
                    case 2:
                        System.out.println("Memory status");
                        break;
                    case 3:
                        phoneBook();
                        break;

                }
                break;
            case 9:
                System.out.println("Speed dials");
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            case 11:
                nokiaMenu();
                break;
        }
    }

    public static void messages () {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Write Messages");
        System.out.println("2. Inbox");
        System.out.println("3. Outbox");
        System.out.println("4. Picture Messages");
        System.out.println("5. Templates");
        System.out.println("6. Smileys");
        System.out.println("7. Message settings");
        System.out.println("8. Info service");
        System.out.println("9. Voice mailbox number");
        System.out.println("10. Service command editor");
        System.out.println("11. Back");
        int messages = input.nextInt();
        switch (messages) {
            case 1:
                System.out.println("Write messages");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                messageSettings();
                break;
            case 8:
                System.out.println("Info service");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
                break;
            case 11:
                nokiaMenu();
                break;

        }
    }
    public static void messageSettings () {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Set 1");
        System.out.println("2. Common");
        System.out.println("3. Back");
        int messageSettings = input.nextInt();
        switch (messageSettings) {
            case 1:
                System.out.println("1. Message centre number");
                System.out.println("2. Message sent as");
                System.out.println("3. Message validity");
                System.out.println("4. Back");
                int set = input.nextInt();
                switch (set) {
                    case 1:
                        System.out.println("Message centre number");
                        break;
                    case 2:
                        System.out.println("Message sent as");
                        break;
                    case 3:
                        System.out.println("Message validity");
                        break;
                    case 4:
                        messageSettings();
                        break;
                }
                break;
            case 2:
                System.out.println("1. Delivery reports");
                System.out.println("2. Reply via same centre");
                System.out.println("3. Character support");
                System.out.println("4. Back");
                int common = input.nextInt();
                switch (common) {
                    case 1:
                        System.out.println("Delivery reports");
                        break;
                    case 2:
                        System.out.println("Reply via same centre");
                        break;
                    case 3:
                        System.out.println("Character support");
                        break;
                    case 4:
                        messageSettings();
                        break;
                }
                break;
            case 3:
                messages();
                break;

        }

    }
    public static void callRegister () {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Missed calls");
        System.out.println("2. Received calls");
        System.out.println("3. Dialed numbers");
        System.out.println("4. Erase recent call lists");
        System.out.println("5. Show call duration");
        System.out.println("6. Show call costs");
        System.out.println("7. Call costs settings");
        System.out.println("8. Prepaid credit");
        System.out.println("9. Back");
        int callRegister = input.nextInt();
        switch (callRegister) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialed numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                System.out.println("1. Last call duration");
                System.out.println("2. All calls` duration");
                System.out.println("3. Received calls duration");
                System.out.println("4. Dialed calls duration");
                System.out.println("5. Clear timers");
                System.out.println("6. Back");
                int showCallDuration = input.nextInt();
                switch (showCallDuration) {
                    case 1:
                        System.out.println("Last call duration");
                        break;
                    case 2:
                        System.out.println("All calls duration");
                        break;
                    case 3:
                        System.out.println("Received call duration");
                        break;
                    case 4:
                        System.out.println("Dialled calls duration");
                        break;
                    case 5:
                        System.out.println("Clear timers");
                        break;
                    case 6:
                        callRegister();
                        break;
                }
                break;
            case 6:
                System.out.println("1. Last call cost");
                System.out.println("2. All calls cost");
                System.out.println("3. Clear Counters");
                System.out.println("4. Back");

                int showCallCost = input.nextInt();
                switch (showCallCost) {
                    case 1:
                        System.out.println("Last call cost");
                        break;
                    case 2:
                        System.out.println("All calls cost");
                        break;
                    case 3:
                        System.out.println("Clear counters");
                        break;
                    case 4:
                        callRegister();
                        break;
                }
                break;
            case 7:
                System.out.println("1. call cost limit");
                System.out.println("2. Show cost in");
                System.out.println("3. Back");

                int callCostSettings = input.nextInt();
                switch (callCostSettings) {
                    case 1:
                        System.out.println("Call cost limit");
                        break;
                    case 2:
                        System.out.println("Show cost in");
                        break;
                    case 3:
                        callRegister();
                        break;
                }
                break;
            case 8:
                System.out.println("Prepaid credit");
                break;
            case 9:
                nokiaMenu();
                break;
        }
    }
    public static void settings () {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Call settings");
        System.out.println("2. Phone settings");
        System.out.println("3. Security settings");
        System.out.println("4. Restore factory settings");
        System.out.println("5. Back");
        int settings = input.nextInt();

        switch (settings) {
            case 1:

                System.out.println("1. Automatic redial");
                System.out.println("2. Speed dialing");
                System.out.println("3. call waiting options");
                System.out.println("4. Own number sending");
                System.out.println("5. Phone line in use");
                System.out.println("6. Automatic answer");
                System.out.println("7. Back");
                int callSettings = input.nextInt();

                switch (callSettings) {
                    case 1:
                        System.out.println("Automatic redial");
                        break;
                    case 2:
                        System.out.println("speed dialing");
                        break;
                    case 3:
                        System.out.println("call waiting options");
                        break;
                    case 4:
                        System.out.println("own number sending");
                        break;
                    case 5:
                        System.out.println("Phone line in use");
                        break;
                    case 6:
                        System.out.println("Automatic answer");
                        break;
                    case 7:
                        settings();
                        break;
                }
                break;
            case 2:

                System.out.println("1. Language");
                System.out.println("2. Cell phone display");
                System.out.println("3. Welcome note");
                System.out.println("4. Network selection");
                System.out.println("5. Lights");
                System.out.println("6. Confirm SIM service actions");
                System.out.println("7. Back");
                int phoneSettings = input.nextInt();
                switch (phoneSettings) {
                    case 1:
                        System.out.println("language");
                        break;
                    case 2:
                        System.out.println("Call phone display");
                        break;
                    case 3:
                        System.out.println("welcome note");
                        break;
                    case 4:
                        System.out.println("network selection");
                        break;
                    case 5:
                        System.out.println("Lights");
                        break;
                    case 6:
                        System.out.println("Confirm SIM service actions");
                        break;
                    case 7:
                        settings();
                        break;
                }
                break;
            case 3:

                System.out.println("1. SPIN code request");
                System.out.println("2. Call barring service");
                System.out.println("3. Fixed dialing");
                System.out.println("4. Closed user group");
                System.out.println("5. Phone security");
                System.out.println("6. Change access codes");
                System.out.println("7. Back");
                int securitySettings = input.nextInt();
                switch (securitySettings) {
                    case 1:
                        System.out.println("1. SPIN code request");
                        break;
                    case 2:
                        System.out.println("2. Call barring service");
                        break;
                    case 3:
                        System.out.println("3. Fixed dialing");
                        break;
                    case 4:
                        System.out.println("4. Closed user group");
                        break;
                    case 5:
                        System.out.println("5. Phone security");
                        break;
                    case 6:
                        System.out.println("6. Change access codes");
                        break;
                    case 7:
                        settings();
                        break;
                }
                break;
            case 4:
                System.out.println("restore factory settings");
                break;
            case 5:
                nokiaMenu();
                break;
        }
    }
}
