public class TestDogCatQueue {
    public static void main(String[] args) {
        DogCatQueue dogcatqueue = new DogCatQueue();
        String type;

        dogcatqueue.add(new Pet("dog"));
        dogcatqueue.add(new Pet("cat"));
        type = dogcatqueue.pollAll().getPetType();
        System.out.println(type);
        type = dogcatqueue.pollAll().getPetType();
        System.out.println(type);
    }
}
