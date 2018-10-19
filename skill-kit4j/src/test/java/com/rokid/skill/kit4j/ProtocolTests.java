package com.rokid.skill.kit4j;

import com.rokid.skill.kit4j.util.JacksonUtil;
import com.rokid.skill.protocol.request.ReqRequest;

/**
 * @author wuyukai
 * @date 2018/8/3
 */
public class ProtocolTests {

  public static void main(String[] args) {
    String json = "{\n"
      + "    \"version\": \"2.0.0\",\n"
      + "    \"session\": {\n"
      + "        \"sessionId\": \"D75D1C9BECE045E9AC4A87DA86303DD6\",\n"
      + "        \"newSession\": true,\n"
      + "        \"attributes\": {\n"
      + "            \"key1\": {\n"
      + "                \"type\": \"\",\n"
      + "                \"value\": \"\"\n"
      + "            }\n"
      + "        }\n"
      + "    },\n"
      + "    \"context\": {\n"
      + "        \"application\": {\n"
      + "            \"applicationId\": \"skill 本身的 Id\",\n"
      + "            \"media\": {\n"
      + "                \"state\": \"PLAYING/PAUSED/IDLE\",\n"
      + "                \"itemId\": \"Skill 响应的 MediaId\",\n"
      + "                \"token\": \"Skill 响应的 MediaToken\",\n"
      + "                \"progress\": \"当前的播放进度单位毫秒\",\n"
      + "                \"duration\": \"当前 Media 的总长度单位毫秒\"\n"
      + "            },\n"
      + "            \"voice\": {\n"
      + "                \"state\": \"PLAYING/PAUSED/IDLE\",\n"
      + "                \"itemId\": \"Skill 响应的 VoiceId\"\n"
      + "            }\n"
      + "        },\n"
      + "        \"device\": {\n"
      + "            \"basic\": {\n"
      + "                \"vendor\": \"注册生产商 ID\",\n"
      + "                \"deviceType\": \"该生产商设定的设备型号\",\n"
      + "                \"deviceId\": \"该型号下的设备 ID\",\n"
      + "                \"masterId\": \"设备主人 ID\",\n"
      + "                \"voicetrigger\": \"设备当前的激活词\",\n"
      + "                \"locale\": \"zh-cn\",\n"
      + "                \"timestamp\": 1478009510909\n"
      + "            },\n"
      + "            \"linkage\": {\n"
      + "                \"trigger\": true\n"
      + "            },\n"
      + "            \"userMode\": {\n"
      + "                \"childMode\": true\n"
      + "            },\n"
      + "            \"screen\": {\n"
      + "                \"x\": \"640\",\n"
      + "                \"y\": \"480\"\n"
      + "            },\n"
      + "            \"media\": {\n"
      + "                \"state\": \"PLAYING / PAUSED / IDLE\"\n"
      + "            },\n"
      + "            \"voice\": {\n"
      + "                \"state\": \"PLAYING / PAUSED / IDLE\"\n"
      + "            },\n"
      + "            \"location\": {\n"
      + "                \"latitude\": \"30.213322455923485\",\n"
      + "                \"longitude\": \"120.01190010997654\",\n"
      + "                \"country\": \"国家\",\n"
      + "                \"state\": \"州/省份\",\n"
      + "                \"city\": \"城市\",\n"
      + "                \"area\": \"区县\",\n"
      + "                \"district\": \"地区，行政\",\n"
      + "                \"street\": \"街道\",\n"
      + "                \"timeZone\": \"时区\"\n"
      + "            }\n"
      + "        },\n"
      + "        \"user\": {\n"
      + "            \"userId\": \"当前用户的ID\"\n"
      + "        }\n"
      + "    },\n"
      + "    \"request\": {\n"
      + "        \"reqType\": \"INTENT / EVENT\",\n"
      + "        \"reqId\": \"当前请求的 Id\",\n"
      + "        \"content\": {\n"
      + "            \"intent\": \"play_random\",\n"
      + "            \"sentence\": \"用户语句\",\n"
      + "            \"slots\": {\n"
      + "                \"key1\": {\n"
      + "                    \"type\": \"\",\n"
      + "                    \"value\": \"\"\n"
      + "                },\n"
      + "                \"key2\": {\n"
      + "                    \"type\": \"\",\n"
      + "                    \"value\": \"\"\n"
      + "                }\n"
      + "            }\n"
      + "        }\n"
      + "    }\n"
      + "}";
    ReqRequest reqRequest = JacksonUtil.toObject(json, ReqRequest.class);
    System.out.println(reqRequest);
  }

}
