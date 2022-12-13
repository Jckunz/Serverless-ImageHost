package com.serverless.imagehost.imageprocessing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Image {
    private String name;
    private String path;

    private byte[] data;

}
