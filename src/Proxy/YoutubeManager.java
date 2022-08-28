package Proxy;


public class YoutubeManager implements YoutubeLib {
    private int videoCount;
    private String videoTitle;
    private int videoDuration;
    private final CachedYoutubeService cachedYoutubeService;


    public YoutubeManager(CachedYoutubeService cachedYoutubeService) {
        this.cachedYoutubeService = cachedYoutubeService;
    }

    @Override
    public int getVideoCount() {
        if (cachedYoutubeService.shouldUseCache(cachedYoutubeService.getVideoDuration())) {
            return cachedYoutubeService.getVideoCount();
        }
        return videoCount;
    }

    @Override
    public String getVideoTitle() {
        return videoTitle;
    }

    @Override
    public int getVideoDuration() {
        return videoDuration;
    }


}
