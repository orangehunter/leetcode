package leetcode;

import java.util.Stack;


public class ReverseString {
public TimeCount timeCount;
	String teString0;
	String teString1;
	String teString2;
	public ReverseString() {
		timeCount=new TimeCount();
		teString0="";
		teString1="hello";
		teString2="A dim-witted Donald Trump fan used suction cups to scale the mogul’s namesake Midtown tower Wednesday in a failed bid to meet the blowhard. The 20-year-old Virginia man evaded frustrated cops for nearly three hours as he clung to the side of the Fifth Ave. skyscraper  Mission Impossible -style before he was yanked to safety through a 21st-floor window by NYPD officers. The daredevil started slowly climbing the glass tower around 3:30 p.m. using hand-held suction cups, ropes, and a climbing harness — stunning visitors on the fourth-floor terrace as he began his ascent.  We were in the public garden at Trump Tower when all of a sudden the guy took off his basketball shorts and sprinted down the side of the building on the ledge,  said Blake Crowson, 20, of Newport News, Va.  We thought he was BASE jumping. He had two duffel bags that looked like they had climbing ropes.  Trump Tower stuntman no expert at climbing, lucky to be alive Witnesses said the nutjob, identified by sources as Stephen Rogata, dropped a notebook and a computer at two different points during his climb.  (JEFFERSON SIEGEL/NEW YORK DAILY NEWS) (JAMES KEIVOM/NEW YORK DAILY NEWS) The daredevil used suction cups, ropes, and a climbing harness. Tyler Jones, 20, a member of the U.S. National Guard said that Rogata looked  determined  and said he was hopping around  like someone getting ready for a marathon.   He seemed like a little kid,  Jones said.  He was full of fear but fully committed.  The bone-headed Trump supporter told cops he just wanted to get the attention of the Republican presidential nominee. Trump's wild remarks raise fears that it will inspire violence  His sole intention was to meet with Mr. Trump,  said NYPD Chief William Aubrey.   18 PHOTOSVIEW GALLERY Man Nabbed Climbing Trump Tower In Midtown Manhattan  Rogata said he had no intention of hurting Trump, who was not in his penthouse apartment atop the 58-story high-rise as the drama unfolded. Trump was in Virginia and Florida Wednesday for a pair of rallies.  Great job today by the NYPD in protecting the people and saving the climber,  Trump tweeted late Wednesday. Rogata was taken to Bellevue hospital in Manhattan for a psychiatric evaluation. It was unclear what charges he might face for his hair-brained hi-jinx. INTERACTIVE FEATURE: See how the Daily News has covered Donald Trump's scandals for 30 years A police source said the Midtown mountaineer might be bipolar. Secret Service agents were spotted at the hospital late Wednesday. Trump Organization executive Michael Cohen issued a statement to ABC News.  This man performed a ridiculous and dangerous stunt. There's damage to the building and he caused the unnecessary deployment of New York’s Finest to protect his safety and the safety of everyone in the building.  Staten Island Trump fan unveils bigger sign for GOP candidate   The loony Trump fan tried climbing the Midtown tower until cops grabbed him. (NEW YORK DAILY NEWS) Police were investigating a video posted on YouTube Tuesday titled  Message to Mr. Trump (why I climbed your tower)  that appeared to show the Spiderman-like climber explaining his ill-advised adventure.  I am an independent researcher seeking a private audience with you to discuss an important matter,  the hooded, long-haired man says in the clip.  Believe me, if my purpose was not significant, I would not risk my life pursuing it,  he adds, before calling on viewers to make the video go viral and vote for Trump. Rogata may be using a second name, police said. Donald Trump trashes newly released Hillary Clinton emails Police said Rogata's backpack contained various forms of identification. He arrived in the city alone Tuesday and stayed in a hotel before embarking on his spectacle, police said.   The climber's ascent was thwarted around 6:30 p.m. when cops hauled him inside the building.  (JAMES KEIVOM/NEW YORK DAILY NEWS) Rogata’s stunt drew hundreds to the streets surrounding the black-glassed building and brought traffic in Midtown to a standstill. The skyscraper houses the headquarters of the Trump Organization. Onlookers rushed to social media to comment on the chaos. Republicans running from Trump after his Second Amendment threat  There is a man scaling Trump Towers with cops watching,  Jason Chu, using the handle @JasonC1219, tweeted. In another tweet, Chu wrote that the climber was carrying a notebook and tried to show it to people in the building, but dropped it as he climbed.   The daredevil claims he climbed the tower because he wanted to meet Donald Trump.  (ALEX CANNON/AP) In a video posted by @StevOLucci,  a woman can be heard asking,  What happens if it starts raining again?  A man responds, to laughter,  He’s gonna slide off!  The NYPD’s Emergency Services Unit used a motorized window washer scaffold and busted through a window on the 16th floor of the building around 5 p.m. in an attempt to coax Rogata inside. Glass rained down on the gravity-defying Trump supporter.   The climber is taken out of Trump Tower in a stretcher following the dramatic ascent. He was brought to a hospital for a psychiatric evaluation.  (SUSAN WATTS/NEW YORK DAILY NEWS) The baseball hat-wearing wild man ignored cops pleas and continued climbing past the shattered window. Cops had set up several airbags in case the climber came crashing down. Detective Christopher Williams, with emergency services, was the cop who eventually grabbed hold of the knucklehead.   Fifth Ave. onlookers watch the climber at work.  (JAMES KEIVOM/NEW YORK DAILY NEWS)  I was waiting for a time it was safe for him, myself and my crew. I said to my team  listen, he's at a level I can grab him and safely bring him in,  Williams said.  I reached out my hand and said  sir, you need to come with me.  Williams said Rogata considered resisting arrest.  He thought about it,  he said, but the suspect ultimately  went peacefully.   ";
	}
	public void run() {
		timeCount.start();
		System.out.println(I(teString2));
		timeCount.next();
		System.out.println(II(teString2));
		timeCount.next();
		System.out.println(III(teString2));
		timeCount.next();
		//System.out.println(IV(teString2));
		timeCount.stop();
	}
	public String I(String s) {
		if (s.length()<=1) {
			return s;
		}else {
			return new StringBuffer(s).reverse().toString();
		}
	}
	public String II(String s) {
		String ans="";
		int i=s.length()-1;
		while (i>=0) {
			ans+=s.charAt(i);
			i--;
		}
		return ans;
	}
	public String III(String s) {
		Stack stk = new Stack();
		for (int i = 0; i < s.length(); i++ ) {
			stk.push(s.charAt(i));
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++ ) {
			sb.append(stk.pop());
		}
		return sb.toString();
	}
	/*public String IV(String s) {
		//Thread haf=new Thread(target);
	}*/
	
}
