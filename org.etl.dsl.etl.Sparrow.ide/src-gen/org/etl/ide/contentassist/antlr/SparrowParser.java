/*
 * generated by Xtext 2.12.0
 */
package org.etl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.etl.ide.contentassist.antlr.internal.InternalSparrowParser;
import org.etl.services.SparrowGrammarAccess;

public class SparrowParser extends AbstractContentAssistParser {

	@Inject
	private SparrowGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSparrowParser createParser() {
		InternalSparrowParser result = new InternalSparrowParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
					put(grammarAccess.getTryAccess().getGroup(), "rule__Try__Group__0");
					put(grammarAccess.getFinallyAccess().getGroup(), "rule__Finally__Group__0");
					put(grammarAccess.getCatchAccess().getGroup(), "rule__Catch__Group__0");
					put(grammarAccess.getFetchAccess().getGroup(), "rule__Fetch__Group__0");
					put(grammarAccess.getCallprocessAccess().getGroup(), "rule__Callprocess__Group__0");
					put(grammarAccess.getUpdatedauditAccess().getGroup(), "rule__Updatedaudit__Group__0");
					put(grammarAccess.getSmsAccess().getGroup(), "rule__Sms__Group__0");
					put(grammarAccess.getSlackAccess().getGroup(), "rule__Slack__Group__0");
					put(grammarAccess.getGooglecalAccess().getGroup(), "rule__Googlecal__Group__0");
					put(grammarAccess.getCopydataAccess().getGroup(), "rule__Copydata__Group__0");
					put(grammarAccess.getWriteCsvAccess().getGroup(), "rule__WriteCsv__Group__0");
					put(grammarAccess.getLoadCsvAccess().getGroup(), "rule__LoadCsv__Group__0");
					put(grammarAccess.getTransformAccess().getGroup(), "rule__Transform__Group__0");
					put(grammarAccess.getProcessAccess().getNameAssignment_1(), "rule__Process__NameAssignment_1");
					put(grammarAccess.getProcessAccess().getTryAssignment_3(), "rule__Process__TryAssignment_3");
					put(grammarAccess.getProcessAccess().getCatchAssignment_4(), "rule__Process__CatchAssignment_4");
					put(grammarAccess.getProcessAccess().getFinallyAssignment_5(), "rule__Process__FinallyAssignment_5");
					put(grammarAccess.getTryAccess().getNameAssignment_1(), "rule__Try__NameAssignment_1");
					put(grammarAccess.getTryAccess().getActionAssignment_3(), "rule__Try__ActionAssignment_3");
					put(grammarAccess.getFinallyAccess().getNameAssignment_1(), "rule__Finally__NameAssignment_1");
					put(grammarAccess.getFinallyAccess().getActionAssignment_3(), "rule__Finally__ActionAssignment_3");
					put(grammarAccess.getCatchAccess().getNameAssignment_1(), "rule__Catch__NameAssignment_1");
					put(grammarAccess.getCatchAccess().getActionAssignment_3(), "rule__Catch__ActionAssignment_3");
					put(grammarAccess.getFetchAccess().getNameAssignment_2(), "rule__Fetch__NameAssignment_2");
					put(grammarAccess.getFetchAccess().getSourceAssignment_4(), "rule__Fetch__SourceAssignment_4");
					put(grammarAccess.getFetchAccess().getValueAssignment_7(), "rule__Fetch__ValueAssignment_7");
					put(grammarAccess.getFetchAccess().getConditionAssignment_10(), "rule__Fetch__ConditionAssignment_10");
					put(grammarAccess.getCallprocessAccess().getNameAssignment_2(), "rule__Callprocess__NameAssignment_2");
					put(grammarAccess.getCallprocessAccess().getTargetAssignment_4(), "rule__Callprocess__TargetAssignment_4");
					put(grammarAccess.getCallprocessAccess().getValueAssignment_7(), "rule__Callprocess__ValueAssignment_7");
					put(grammarAccess.getCallprocessAccess().getConditionAssignment_10(), "rule__Callprocess__ConditionAssignment_10");
					put(grammarAccess.getUpdatedauditAccess().getNameAssignment_2(), "rule__Updatedaudit__NameAssignment_2");
					put(grammarAccess.getUpdatedauditAccess().getLogsinkAssignment_4(), "rule__Updatedaudit__LogsinkAssignment_4");
					put(grammarAccess.getUpdatedauditAccess().getValueAssignment_7(), "rule__Updatedaudit__ValueAssignment_7");
					put(grammarAccess.getSmsAccess().getNameAssignment_2(), "rule__Sms__NameAssignment_2");
					put(grammarAccess.getSmsAccess().getTargetAssignment_4(), "rule__Sms__TargetAssignment_4");
					put(grammarAccess.getSmsAccess().getValueAssignment_7(), "rule__Sms__ValueAssignment_7");
					put(grammarAccess.getSmsAccess().getConditionAssignment_10(), "rule__Sms__ConditionAssignment_10");
					put(grammarAccess.getSlackAccess().getNameAssignment_2(), "rule__Slack__NameAssignment_2");
					put(grammarAccess.getSlackAccess().getTeamAssignment_4(), "rule__Slack__TeamAssignment_4");
					put(grammarAccess.getSlackAccess().getChannelAssignment_6(), "rule__Slack__ChannelAssignment_6");
					put(grammarAccess.getSlackAccess().getValueAssignment_9(), "rule__Slack__ValueAssignment_9");
					put(grammarAccess.getSlackAccess().getConditionAssignment_12(), "rule__Slack__ConditionAssignment_12");
					put(grammarAccess.getGooglecalAccess().getNameAssignment_2(), "rule__Googlecal__NameAssignment_2");
					put(grammarAccess.getGooglecalAccess().getCalidAssignment_4(), "rule__Googlecal__CalidAssignment_4");
					put(grammarAccess.getGooglecalAccess().getAuthstoreAssignment_6(), "rule__Googlecal__AuthstoreAssignment_6");
					put(grammarAccess.getGooglecalAccess().getUseraccountAssignment_8(), "rule__Googlecal__UseraccountAssignment_8");
					put(grammarAccess.getGooglecalAccess().getTitleAssignment_10(), "rule__Googlecal__TitleAssignment_10");
					put(grammarAccess.getGooglecalAccess().getStartAssignment_12(), "rule__Googlecal__StartAssignment_12");
					put(grammarAccess.getGooglecalAccess().getEndAssignment_14(), "rule__Googlecal__EndAssignment_14");
					put(grammarAccess.getGooglecalAccess().getNotifyAssignment_16(), "rule__Googlecal__NotifyAssignment_16");
					put(grammarAccess.getGooglecalAccess().getValueAssignment_19(), "rule__Googlecal__ValueAssignment_19");
					put(grammarAccess.getGooglecalAccess().getConditionAssignment_22(), "rule__Googlecal__ConditionAssignment_22");
					put(grammarAccess.getCopydataAccess().getNameAssignment_2(), "rule__Copydata__NameAssignment_2");
					put(grammarAccess.getCopydataAccess().getSourceAssignment_4(), "rule__Copydata__SourceAssignment_4");
					put(grammarAccess.getCopydataAccess().getToAssignment_6(), "rule__Copydata__ToAssignment_6");
					put(grammarAccess.getCopydataAccess().getValueAssignment_9(), "rule__Copydata__ValueAssignment_9");
					put(grammarAccess.getCopydataAccess().getConditionAssignment_12(), "rule__Copydata__ConditionAssignment_12");
					put(grammarAccess.getWriteCsvAccess().getNameAssignment_2(), "rule__WriteCsv__NameAssignment_2");
					put(grammarAccess.getWriteCsvAccess().getSourceAssignment_4(), "rule__WriteCsv__SourceAssignment_4");
					put(grammarAccess.getWriteCsvAccess().getToAssignment_6(), "rule__WriteCsv__ToAssignment_6");
					put(grammarAccess.getWriteCsvAccess().getDelimAssignment_8(), "rule__WriteCsv__DelimAssignment_8");
					put(grammarAccess.getWriteCsvAccess().getValueAssignment_11(), "rule__WriteCsv__ValueAssignment_11");
					put(grammarAccess.getWriteCsvAccess().getConditionAssignment_14(), "rule__WriteCsv__ConditionAssignment_14");
					put(grammarAccess.getLoadCsvAccess().getNameAssignment_2(), "rule__LoadCsv__NameAssignment_2");
					put(grammarAccess.getLoadCsvAccess().getSourceAssignment_4(), "rule__LoadCsv__SourceAssignment_4");
					put(grammarAccess.getLoadCsvAccess().getToAssignment_6(), "rule__LoadCsv__ToAssignment_6");
					put(grammarAccess.getLoadCsvAccess().getDelimAssignment_8(), "rule__LoadCsv__DelimAssignment_8");
					put(grammarAccess.getLoadCsvAccess().getValueAssignment_11(), "rule__LoadCsv__ValueAssignment_11");
					put(grammarAccess.getLoadCsvAccess().getConditionAssignment_14(), "rule__LoadCsv__ConditionAssignment_14");
					put(grammarAccess.getTransformAccess().getNameAssignment_2(), "rule__Transform__NameAssignment_2");
					put(grammarAccess.getTransformAccess().getOnAssignment_4(), "rule__Transform__OnAssignment_4");
					put(grammarAccess.getTransformAccess().getValueAssignment_7(), "rule__Transform__ValueAssignment_7");
					put(grammarAccess.getTransformAccess().getConditionAssignment_10(), "rule__Transform__ConditionAssignment_10");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SparrowGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SparrowGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
