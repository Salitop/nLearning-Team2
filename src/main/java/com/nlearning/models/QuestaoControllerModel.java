package com.nlearning.models;

import java.io.Serializable;

public class QuestaoControllerModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long idQuestao;
	
	private long idCurso;
	
	public long getIdQuestao() {
		return idQuestao;
	}
	public void setIdQuestao(long idQuestao) {
		this.idQuestao = idQuestao;
	}

	public long getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}
}
