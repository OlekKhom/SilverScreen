package pl.cinema.SilverScreen.MoviesRoom.model;

public class MoviesRoomMapper {

    public static MoviesRoomHttpResponse map(MoviesRoom moviesRoom) {
        return MoviesRoomHttpResponse.builder()
                .id(moviesRoom.getId())
                .numberRoom(moviesRoom.getNumberRoom())
                .seats(moviesRoom.getSeats())
                .soundType(moviesRoom.getSoundType())
                .build();
    }

    public static MoviesRoom map(MoviesRoomHttpRequest moviesRoom) {
        return MoviesRoom.builder()
                .numberRoom(moviesRoom.getNumberRoom())
                .seats(moviesRoom.getSeats())
                .soundType(moviesRoom.getSoundType())
                .build();
    }
}
