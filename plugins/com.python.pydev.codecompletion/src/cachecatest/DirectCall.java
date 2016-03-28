package cachecatest;

public class DirectCall {
    public static void main(String args[])
    {
        //        String activationToken = "import";
        //        String qualifier = "";
        //        int offset = activationToken.length();
        //        // PyEdit py = new PyEdit();
        //        KeywordsSimpleAssist k = new KeywordsSimpleAssist();
        //        //CodecompletionPlugin c = new CodecompletionPlugin();
        //        Collection<ICompletionProposal> proposals = k
        //                .computeCompletionProposalsTest(activationToken, qualifier, offset);
        //        for (ICompletionProposal x : proposals)
        //        {
        //            System.out.println(x.getDisplayString() + "\n");
        //        }
        String p = " abcdef";
        String[] pref = p
                .split("((?<=\\.)|(?=\\.))| |((?<=\\{)|(?=\\{))|((?<=\\()|(?=\\())|((?<=\\))|(?=\\)))|((?<=\\[)|(?=\\[))|((?<=\\;)|(?=\\;))");
        for (String s : pref) {
            System.out.println(s);
        }
    }
}
