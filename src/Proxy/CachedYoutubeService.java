package Proxy;

public class CachedYoutubeService implements YoutubeLib {

    private static final int videoCount = 1000;

    private static final int videoDuration = 10;
    private String videoTitle;

    private final YoutubeService youtubeService;

    public Boolean shouldUseCache(int duration) {
        if (duration > videoDuration) {
            return true;
        }
        return false;
    }

    public CachedYoutubeService(YoutubeService youtubeService) {
        this.youtubeService = youtubeService;
    }

    @Override
    public int getVideoCount() {
        if (youtubeService.shouldUseCache(youtubeService.getVideoDuration())) {
            return youtubeService.getVideoCount();
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
