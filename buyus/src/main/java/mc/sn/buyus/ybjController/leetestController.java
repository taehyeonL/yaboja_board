package mc.sn.buyus.ybjController;

import org.springframework.http.HttpHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class leetestController {
	
//	   @GetMapping("/GetDB")
//	    public String callAPI() {
//	 
//	        HashMap<String, Object> result = new HashMap<String, Object>();
//	 
//	        String jsonInString = "";
//	 
//	        try {
//	 
//	            HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
//	            factory.setConnectTimeout(5000); //타임아웃 설정 5초
//	            factory.setReadTimeout(5000);//타임아웃 설정 5초
//	            RestTemplate restTemplate = new RestTemplate(factory);
//	 
//	            HttpHeaders header = new HttpHeaders();
//	            HttpEntity<?> entity = new HttpEntity<>(header);
//	 
//	            String url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json";
//	 
//	            UriComponents uri = UriComponentsBuilder.fromHttpUrl(url+"?"+"key=430156241533f1d058c603178cc3ca0e&targetDt=20120101").build();
//	 
//	            //이 한줄의 코드로 API를 호출해 MAP타입으로 전달 받는다.
//	            ResponseEntity<Map> resultMap = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, Map.class);
//	 
//	            result.put("statusCode", resultMap.getStatusCodeValue()); //http status code를 확인
//	            result.put("header", resultMap.getHeaders()); //헤더 정보 확인
//	            result.put("body", resultMap.getBody()); //실제 데이터 정보 확인
//	 
//	            LinkedHashMap lm = (LinkedHashMap)resultMap.getBody().get("boxOfficeResult");
//	            ArrayList<Map> dboxoffList = (ArrayList<Map>)lm.get("dailyBoxOfficeList");
//	            LinkedHashMap mnList = new LinkedHashMap<>();
//	            for (Map obj : dboxoffList) {
//	                mnList.put(obj.get("rnum"),obj.get("movieNm"));
//	            }
//	            ObjectMapper mapper = new ObjectMapper();
//	            jsonInString = mapper.writeValueAsString(mnList);
//	 
//	        } catch (HttpClientErrorException | HttpServerErrorException e) {
//	            result.put("statusCode", e.getRawStatusCode());
//	            result.put("body"  , e.getStatusText());
//	            System.out.println("dfdfdfdf");
//	            System.out.println(e.toString());
//	 
//	        } catch (Exception e) {
//	            result.put("statusCode", "999");
//	            result.put("body"  , "excpetion오류");
//	            System.out.println(e.toString());
//	        }
//	 
//	        return jsonInString;
//	 
//	    }
	   @GetMapping("/GetDB")
	    public String callAPI() throws JsonProcessingException {
	 
	        HashMap<String, Object> result = new HashMap<String, Object>();
	 
	        String jsonInString = "";
	 
	        try {
	 
	            HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
	            factory.setConnectTimeout(5000); //타임아웃 설정 5초
	            factory.setReadTimeout(5000);//타임아웃 설정 5초
	            RestTemplate restTemplate = new RestTemplate(factory);
	 
	            HttpHeaders header = new HttpHeaders();
	            HttpEntity<?> entity = new HttpEntity<>(header);
	 
	            String url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json";
	 
	            UriComponents uri = UriComponentsBuilder.fromHttpUrl(url+"?"+"key=430156241533f1d058c603178cc3ca0e&targetDt=20120101").build();
	 
	            //이 한줄의 코드로 API를 호출해 MAP타입으로 전달 받는다.
	            ResponseEntity<Map> resultMap = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, Map.class);
	            result.put("statusCode", resultMap.getStatusCodeValue()); //http status code를 확인
	            result.put("header", resultMap.getHeaders()); //헤더 정보 확인
	            result.put("body", resultMap.getBody()); //실제 데이터 정보 확인
	 
	            //데이터를 제대로 전달 받았는지 확인 string형태로 파싱해줌
	            ObjectMapper mapper = new ObjectMapper();
	            jsonInString = mapper.writeValueAsString(resultMap.getBody());
	 
	        } catch (HttpClientErrorException | HttpServerErrorException e) {
	            result.put("statusCode", e.getRawStatusCode());
	            result.put("body"  , e.getStatusText());
	            System.out.println("dfdfdfdf");
	            System.out.println(e.toString());
	 
	        } catch (Exception e) {
	            result.put("statusCode", "999");
	            result.put("body"  , "excpetion오류");
	            System.out.println(e.toString());
	        }
	 
	        return jsonInString;
	 
	    }
}
