/*
 * Copyright (C) Keanu Poeschko - All Rights Reserved
 * Unauthorized copying of this file is strictly prohibited
 *
 * Created by Keanu Poeschko <nur1popcorn@gmail.com>, April 2017
 * This file is part of {Irrlicht}.
 *
 * Do not copy or distribute files of {Irrlicht} without permission of {Keanu Poeschko}
 *
 * Permission to use, copy, modify, and distribute my software for
 * educational, and research purposes, without a signed licensing agreement
 * and for free, is hereby granted, provided that the above copyright notice
 * and this paragraph appear in all copies, modifications, and distributions.
 *
 *
 *
 *
 */

package com.nur1popcorn.irrlicht.engine.hooker;

import org.objectweb.asm.tree.MethodNode;

/**
 * The {@link HookingMethod} is responsible for handling custom checks.
 *
 * @see Hooker
 * @see com.nur1popcorn.irrlicht.engine.events.Event
 * @see MethodNode
 *
 * @author nur1popcorn
 * @since 1.0.0-alpha
 */
public interface HookingHandler
{
    /**
     * Adds a custom hook to the {@link MethodNode} provided.
     *
     * @param methodNode the {@link MethodNode} which the hook is supposed to be added to.
     */
    public void hook(MethodNode methodNode);
}
