package dai37kai;

public class Ship {
    int mapSize = 5;
    int[][] map = new int[mapSize][mapSize];

    public Ship(){
        for(int i = 0; i < mapSize; i++){
            for(int j = 0; j < mapSize; j++){
                map[i][j] = 0;
            }
        }
    }
}
