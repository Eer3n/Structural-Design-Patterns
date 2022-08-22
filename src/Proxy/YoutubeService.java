package Proxy;

public class YoutubeService implements YoutubeLib {

    private static final int CACHE_DURATION = 15;

    private int videoCount;
    private String videoTitle;
    private int videoDuration;

    public Boolean shouldUseCache(int duration) {
        if (duration > CACHE_DURATION) {
            return true;
        }
        return false;
    }

    @Override
    public int getVideoCount() {
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

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public void setVideoDuration(int videoDuration) {
        this.videoDuration = videoDuration;
    }
}
