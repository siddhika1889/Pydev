/*
 * Created on May 1, 2006
 */
package com.python.pydev.refactoring.wizards.rename;

import java.util.List;

import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.python.pydev.editor.codecompletion.revisited.visitors.Definition;
import org.python.pydev.editor.refactoring.RefactoringRequest;
import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.visitors.scope.ASTEntry;

import com.python.pydev.analysis.scopeanalysis.ScopeAnalysis;

public class PyRenameClassProcess extends AbstractRenameRefactorProcess{

    public PyRenameClassProcess(Definition definition) {
        super(definition);
    }

    protected void checkInitialOnLocalScope(RefactoringStatus status, RefactoringRequest request) {
        SimpleNode root = request.getAST();
        List<ASTEntry> oc = ScopeAnalysis.getLocalOcurrences(request.duringProcessInfo.initialName, root);
        addOccurrences(request, oc);
        oc = ScopeAnalysis.getAttributeReferences(request.duringProcessInfo.initialName, request.getAST());
		addOccurrences(request, oc);
    }
}
