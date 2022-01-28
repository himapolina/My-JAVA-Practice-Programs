class q9i{
    public static void main(String[] args) {
        String[] words = { "Hima", "Bindu", "Polina" };
        Character[] characters = { 'a', 'b', 'c' };
        Integer[] numbers = { 1, 2, 3, 4, 5};
        reverseArray(words);
        reverseArray(characters);
        reverseArray(numbers);
        }
        public static <T> void reverseArray(T[] array) {
        System.out.print("Array: ");
        for (int i = 0; i <= array.length - 1; i++)
        System.out.print(array[i] + " ");
        System.out.print("\n Reversed Array: ");
        for (int i = array.length - 1; i >= 0; i--)
        System.out.print(array[i] + " ");
        System.out.println();
    }
}
