package mc.sn.buyus.YbjService;

//@Service("jwtService")
public interface SecurityService {
	
	String createJWT(String subject, long ttlMillis);
	String verifyJWT(String token);
}
