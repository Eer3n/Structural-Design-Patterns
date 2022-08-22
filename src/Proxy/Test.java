package Proxy;

public class Test {
    public static void main(String[] args) {

        YoutubeService service = new YoutubeService();
        service.setVideoDuration(16);
        service.setVideoCount(20);

        CachedYoutubeService proxyService = new CachedYoutubeService(service);

        System.out.println(proxyService.getVideoCount());

        //Odev YouTubeManager diye object yaratılacak, bu obje proxy objesini alıp hangi videoCount değerini seçiceğine karar verecek!
        //ve YouTubeManager'ın getVideoCount diye bir metodu olacak bu metod ilgili şekilde doğru değeri dönecek!
    }
}