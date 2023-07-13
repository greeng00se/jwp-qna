package qna.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static qna.fixtures.QuestionFixture.Q1;
import static qna.fixtures.UserFixture.JAVAJIGI;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@SuppressWarnings("NonAsciiCharacters")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AnswerTest {

    @Test
    void 소유자인지_확인한다() {
        // given
        Answer answer = new Answer(JAVAJIGI, Q1, "안녕하세요");

        // expect
        assertThat(answer.isOwner(JAVAJIGI)).isTrue();
    }

    @Test
    void 삭제된_상태로_변경한다() {
        // given
        Answer answer = new Answer(JAVAJIGI, Q1, "안녕하세요");

        // when
        answer.changeDeleted(true);

        // then
        assertThat(answer.isDeleted()).isTrue();
    }
}
