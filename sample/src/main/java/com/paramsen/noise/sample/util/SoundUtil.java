package com.paramsen.noise.sample.util;

import android.util.Log;

/**
 * Created by Gao Xuefeng
 * on 2019-06-06
 */
public class SoundUtil {
    public static Double calcDecibelLevel(short[] buffer, int readSize) {
        long v = 0;
        // 将 buffer 内容取出，进行平方和运算
        for (int i = 0; i < buffer.length; i++) {
            v += buffer[i] * buffer[i];
        }
        // 平方和除以数据总长度，得到音量大小。
        double mean = v / (double) readSize;
        double volume = 10 * Math.log10(mean);

        Log.e("pcm", "分贝值 = " + volume);
        return volume;
    }
}
