package room;

public enum RoomType {
   STANDARD("standard room"),
   SUPERIOR("superior room"),
   DELUXE("deluxe room"),
   SUITE("suite room");

   final String name;
   RoomType(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
}
