package com.example.infs3605.Entities;

import com.example.infs3605.R;

import java.util.ArrayList;

public class Social {

    private int socialId;
    private int socialIcon;
    private String socialAccount;
    private int socialImage;
    private String socialDesc;

    public Social(int socialId, int socialIcon, String socialAccount, int socialImage, String socialDesc) {
        this.socialId = socialId;
        this.socialIcon = socialIcon;
        this.socialAccount = socialAccount;
        this.socialImage = socialImage;
        this.socialDesc = socialDesc;
    }

    public int getSocialIcon() {
        return socialIcon;
    }

    public void setSocialIcon(int socialIcon) {
        this.socialIcon = socialIcon;
    }

    public String getSocialAccount() {
        return socialAccount;
    }

    public void setSocialAccount(String socialAccount) {
        this.socialAccount = socialAccount;
    }

    public int getSocialImage() {
        return socialImage;
    }

    public void setSocialImage(int socialImage) {
        this.socialImage = socialImage;
    }

    public String getSocialDesc() {
        return socialDesc;
    }

    public void setSocialDesc(String socialDesc) {
        this.socialDesc = socialDesc;
    }

    public int getSocialId() {
        return socialId;
    }

    public void setSocialId(int socialId) {
        this.socialId = socialId;
    }

    public static ArrayList<Social> getSocialList() {
        ArrayList<Social> socialList = new ArrayList<>();


        socialList.add((new Social(0, R.drawable.wanyara_icon,"wanyara.aus", R.drawable.social2,
                "Firbank girls painting symbols that represent them onto their clay coolamon.\n" +
                        "\n" +
                        "We love that students embrace our culture and we love sharing it.")));

        socialList.add((new Social(1, R.drawable.koori_icon, "koorimailnewspaper", R.drawable.social14, "Have you had a chance to check out this inspiring story of Zhanae Dodd (Ghungalu and Biri woman) on page 6?\n" +
                "\n" +
                "...\"We had a launch day back in April, when I was sworn into Parliament alongside 92 other youth members, all aged between 15 and 25, and given the chance to meet other members of our portfolio too.\"...\n" +
                "\n" +
                "Edition 755 of the Koori Mail is out now!\n" +
                "Check out the latest news in our current edition, and much more!\n" +
                "To subscribe, visit www.koorimail.com")));

        socialList.add((new Social(2, R.drawable.jsly_icon,"j.sly_indigenous_designs", R.drawable.social6,
                "Happy Saturday mob \uD83D\uDE4C\uD83C\uDFFD\n" +
                        "\n" +
                        "Action shot from my most recent mural! ✍\uD83C\uDFFD\uD83C\uDFA8\uD83C\uDFA8\n" +
                        "Can’t wait to share the final piece with everyone very soon \uD83D\uDD25\uD83D\uDD25")));

        socialList.add((new Social(3, R.drawable.wanyara_icon,"wanyara.aus", R.drawable.social4,
                "Wanyara are the home of TAG (Traditional Aboriginal Games) however don’t forget we offer a number of different sessions.")));


        socialList.add((new Social(4, R.drawable.wanyara_icon, "wanyara.aus", R.drawable.social11,
                "Its absolutely essential that all Australians have an understanding of the First people of our country!\n" +
                        "To move forward together, we must understand our past, together.\n" +
                        "\n" +
                        "Wanyara brings Aboriginal and Torres Strait Islander mentors into your school, enabling genuine connections, while empowering our mob through sharing their stories.\n" +
                        "\n" +
                        "Will you come with us, can you keep up?")));

        socialList.add((new Social(5, R.drawable.jsly_icon,"j.sly_indigenous_designs", R.drawable.social7,
                "Happy NAIDOC week my people! \uD83D\uDDA4\uD83D\uDC63\n" +
                        "Sending big love to everyone and hope you all have a deadly week wherever you may be. For those in lockdowns or under restrictions stay safe and stay deadly ✊\uD83C\uDFFD♥️\n" +
                        "\n" +
                        "#naidocweek #naidoc2021 #jslyindigenousdesigns #aboriginal #aboriginalart")));

        socialList.add((new Social(6, R.drawable.wanyara_icon,"wanyara.aus", R.drawable.social3,
                "What a deadly action shot!\n" +
                        "Can’t wait to be back sharing moments like this next year.\n" +
                        "\n" +
                        "Currently taking bookings for 2021, if you want Wanyara to visit your school click the link in our bio for more information.")));

        socialList.add((new Social(7,
                R.drawable.koori_icon, "koorimailnewspaper", R.drawable.social13, "Flag bearers set the standard at Olympics\n" +
                "ABORIGINAL and Torres Strait Islander basketball star Patty Mills made history last weekend when he carried the Australian flag at the Opening Ceremony of the Tokyo Olympic Games.")));


        socialList.add((new Social(8, R.drawable.botb_icon, "backofthebrush", R.drawable.social12,
                "Latest artwork\n" +
                        "Painted over this last week while stuck at home in lockdown-unable to work.\n" +
                        "\n" +
                        "‘Currents of life’\n" +
                        "This artwork represents companionship and doing life alongside someone.\n" +
                        "Someone to ride life’s different currents with while swimming in the same direction.\n" +
                        "Lockdown makes me more aware of how important it is to do life with others. #backofthebrushdesigns #turtle #turtles #friends #partners #lifetogether #aboriginalart #dotpaintings" )));

        socialList.add((new Social(9, R.drawable.wanyara_icon,"wanyara.aus", R.drawable.social1,
                "Our art sessions include some storytelling, connection and protocol.\n" +
                        "\n" +
                        "If you would like to book an art session for Reconciliation week, contact us now!\n" +
                        "\n" +
                        "www.wanyara.com.au")));

        socialList.add((new Social(10,R.drawable.dylanbarnes_icon,"dylan.barnes.art", R.drawable.social10,
                "\"Birramal Dhin-Galang\"\n" +
                        "(Bush Berries) (40.5cm x 40.5cm)\n" +
                        "\n" +
                        "In this artwork I wanted to depict the vibrant colours, complex anatomy and spiritual essence of bush foods, particularly the bush berries that grow on Mother Earth.\n" +
                        "\n" +
                        "I wanted to capture the spiritual presences that exist within the Dreaming, where the spirits of humans, animals, the Earth, and bush foods exist on a physical and spiritual continuum.\n" +
                        "\n" +
                        "(July 2020)\n" +
                        "#aboriginal #aboriginalart #indigenous #indigenousart")));

        socialList.add((new Social(11, R.drawable.wanyara_icon,"wanyara.aus", R.drawable.social5,
                "Being Indigenous is about having a deep connection to the land, community and culture. This proverb reflects the wisdom of the Indigenous Australians. I think it means to maintain a positive, optimist outlook on life. What do you think it’s trying to say?")));


        socialList.add((new Social(12,R.drawable.dylanbarnes_icon,"dylan.barnes.art", R.drawable.social9,
                "I designed this logo for the Macquarie University Indigenous Student Association (@mq_isa) back in July 2020.\n" +
                        "\n" +
                        "This logo depicts a snake with various Aboriginal artistic styles from different language groups displayed on its body. The snake represents the unity of Aboriginal Peoples all over Australia and our deep connections to Country and other living/non-living presences. Different stories and cultural perspectives can be found within each artistic style that pertains to different Aboriginal language groups.\n" +
                        "#aboriginal #aboriginalart #indigenous #indigenousart")));

        socialList.add((new Social (13, R.drawable.wanyara_icon, "wanyara.aus", R.drawable.social15, "Not many Australians know a famous Aboriginal person but there is one right there on the $50 note. David Unaipon (1872 - 1967) was a Ngarrindjeri man, a preacher, inventor and writer. Among his patents was a helicopter design based on the principle of the boomerang.\n" +
                "\n" +
                "#famouspeople #australian #learnmore #proudculture #aboriginal #history")));


        socialList.add((new Social(14,R.drawable.dylanbarnes_icon,"dylan.barnes.art", R.drawable.social8,
                "\"Dungal Wambadar\"\n" +
                        "(Support Lights) (40cm x 40cm)\n" +
                        "\n" +
                        "I did this artwork as a commission piece for a friend in August 2020. I wanted this piece to capture how important our family, friends, partners, and community members are in supporting us and our growth. The central pillar represents the individual (us) and the various layers of emotion, intellect, spirituality, and knowledge that we possess. The beams of light that surround our pillars are our central support networks that protect and guide us wherever we may be.\n" +
                        "\n" +
                        "(August 2020)")));


        return socialList;
    }
}
