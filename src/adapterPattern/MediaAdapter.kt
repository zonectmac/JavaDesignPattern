package adapterPattern

class MediaAdapter(audioType: String) : MediaPlayer {
    private lateinit var advancedMediaPlayer: AdvancedMediaPlayer

    init {
        if (audioType.equals("vlc", true)) {
            advancedMediaPlayer = VlcPlayer()
        } else if (audioType.equals("mp4", true)) {
            advancedMediaPlayer = Mp4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("vlc", true)) {
            advancedMediaPlayer.playVlc(fileName)
        } else if (audioType.equals("mp4", true)) {
            advancedMediaPlayer.playMp4(fileName)
        }
    }
}