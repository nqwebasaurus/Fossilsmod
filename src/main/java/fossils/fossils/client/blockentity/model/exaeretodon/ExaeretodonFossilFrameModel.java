package fossils.fossils.client.blockentity.model.exaeretodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ExaeretodonFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Belly;
	private final ModelPart body3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Rightfrontfoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Leftfrontfoot2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart Lowerjaw1;
	private final ModelPart bone2;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone5;
	private final ModelPart bone;
	private final ModelPart bone7;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Righthindfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart Lefthindfoot2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart bone4;
	private final ModelPart bone6;

	public ExaeretodonFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Belly = this.Hips.getChild("Belly");
		this.body3 = this.Belly.getChild("body3");
		this.body = this.body3.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Rightfrontfoot2 = this.Rightfrontfoot.getChild("Rightfrontfoot2");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Leftfrontfoot2 = this.Leftfrontfoot.getChild("Leftfrontfoot2");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.bone2 = this.Lowerjaw1.getChild("bone2");
		this.leftFace = this.Head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone5 = this.rightFace.getChild("bone5");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone7 = this.Bodyfront.getChild("bone7");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Righthindfoot2 = this.Righthindfoot.getChild("Righthindfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.Lefthindfoot2 = this.Lefthindfoot.getChild("Lefthindfoot2");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.bone4 = this.Hips.getChild("bone4");
		this.bone6 = this.Hips.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -10.0F, 12.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(1, 1).addBox(-2.1F, -13.0F, -12.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-2.3F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7F, -9.5F, -12.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.0F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -9.5F, 13.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -23.5F, 8.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.2815F, 6.1072F, -0.4842F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 15).addBox(-0.5F, 0.825F, 6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 9).addBox(-0.5F, 0.825F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6503F, -5.613F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8723F, -5.5976F, 0.2813F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Belly.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 46).addBox(-0.5F, -0.8312F, -0.111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4028F, -2.1197F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body3 = Belly.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1574F, -1.9404F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 18).addBox(-0.5F, 0.8F, 6.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -11.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = body3.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1809F, -3.9018F, 0.0699F, 0.0435F, 0.003F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.825F, 3.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, -7.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.207F, -3.9505F, -0.0526F, 0.0871F, -0.0046F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 28).addBox(-0.5F, 0.825F, 2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 25).addBox(-0.5F, 0.825F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.4971F, -6.9726F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2092F, -4.0323F, 0.0112F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6409F, 5.8031F, -7.4629F, 1.0436F, 0.2125F, -0.53F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3335F, 5.4253F, 0.2955F, -1.2184F, 0.2395F, 0.5652F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 0.2615F, -0.0843F, -0.0225F));

		PartDefinition Rightfrontfoot2 = Rightfrontfoot.addOrReplaceChild("Rightfrontfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.071F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6409F, 5.8031F, -7.4629F, -0.285F, -0.1128F, 0.9152F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3335F, 5.4253F, 0.2955F, -1.0002F, -0.2395F, -0.5652F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 1.154F, 0.4736F, 0.038F));

		PartDefinition Leftfrontfoot2 = Leftfrontfoot.addOrReplaceChild("Leftfrontfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.071F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5F, 0.8811F, -1.913F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3723F, -6.9384F, 0.1914F, -0.0857F, -0.0166F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(62, 66).addBox(-0.5F, 0.1497F, -2.076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 67).addBox(-0.5F, 0.1497F, -0.3759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6667F, -1.875F, -0.3261F, -0.1108F, -0.0544F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(35, 55).addBox(-0.5F, 0.1833F, -2.8615F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0478F, -1.9295F, 0.1122F, 0.0434F, 0.0049F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4804F, -1.8728F, 0.6967F, 0.1344F, 0.1117F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.5235F, -1.3789F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone2 = Lowerjaw1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.3725F, -0.2223F, -0.2661F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4667F, -4.2203F, -9.1702F, 0.0F, -0.0524F, 0.0F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5207F, 1.8701F, 3.8858F, 0.0F, -0.0218F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4667F, -4.2203F, -9.1702F, 0.0F, 0.0524F, 0.0F));

		PartDefinition bone5 = rightFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5207F, 1.8701F, 3.8858F, 0.0F, 0.0218F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6945F, 2.9999F, -6.0663F, -0.0873F, 0.0F, 0.0873F));

		PartDefinition bone7 = Bodyfront.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6945F, 2.9999F, -6.0663F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3569F, 3.5241F, 0.1782F, 0.8487F, -0.0982F, -0.2383F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1249F, 5.9583F, 0.5153F, 1.4209F, -0.1266F, 0.1772F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0742F, 4.3358F, 0.1718F, -0.2123F, 0.0156F, -0.0186F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2891F, -1.7934F, -1.0156F, -0.0107F, -0.0071F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3569F, 3.5241F, 0.1782F, -0.5476F, 0.0982F, 0.2383F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1249F, 5.9583F, 0.5153F, 1.4645F, 0.1266F, -0.1772F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0742F, 4.3358F, 0.1718F, -0.2996F, -0.0156F, 0.0186F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2891F, -1.7934F, -0.1429F, 0.0107F, 0.0071F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.3412F, -0.1143F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7491F, 1.3948F, -0.0075F, 0.0873F, -0.0007F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 25).addBox(-0.5F, 0.1718F, -0.6392F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 28).addBox(-0.5F, 0.1718F, 3.0608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0983F, 3.9264F, 0.2349F, 0.1273F, 0.0304F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.045F, 3.8928F, 0.1586F, 0.3018F, 0.0475F));

		PartDefinition cube_r8 = Tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 43).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6824F, 1.1216F, 0.0F, -0.0349F, 0.0F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6825F, 4.4015F, 0.1532F, 0.1298F, 0.017F, 0.0011F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6825F, 4.4015F, 0.1532F, 0.1298F, -0.017F, -0.0011F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}