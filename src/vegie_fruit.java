class vegie_fruit {
    public void fruits() {  // Public method
        String[] fru = {"MANGO", "APPLE", "GUAVA", "STRAWBERRY", "KIWI"};
        System.out.println("FRUITS :");
        for (int i = 0; i < fru.length; i++) {
            System.out.println(fru[i]);
        }
    }

    static void vegetables() {  // Static method
        String vegies[] = {"POTATO", "TOMATO", "ONION", "GARLIC", "SPINACH"};
        System.out.println("VEGETABLES :");
        for (int i = 0; i < vegies.length; i++) {
            System.out.println(vegies[i]);
        }
    }

        public static void main(String[] args) {
            vegie_fruit hola = new vegie_fruit();    // need to create object
            hola.fruits();
            System.out.println();

            vegetables();   // no need to create object
        }
    }

