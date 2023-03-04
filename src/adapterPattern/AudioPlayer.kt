package adapterPattern

class AudioPlayer : MediaPlayer {
    private lateinit var mediaAdapter: MediaAdapter

    override fun play(audioType: String, fileName: String) {
        //播放mp3音乐文件的内置支持
        if (audioType.equals("mp3", true)) {
            println("Playing mp3 fileName:$fileName")
        } else if (audioType.equals("vlc", true) || audioType.equals("mp4", true)) {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter.play(audioType, fileName)
        } else {
            println("invalid media $audioType format not support")
        }
    }
}